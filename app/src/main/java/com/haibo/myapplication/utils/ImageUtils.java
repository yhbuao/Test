package com.haibo.myapplication.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * 项目名称: xhhread-android.
 * 创建人: yuhaibo
 * 创建时间: 2016/7/19 14:28.
 * Bitmap catBitmap = BitmapFactory.decodeFile("/sdcard/smallcat.jpg");
 * imageView.setImageBitmap(ImageUtils.createRoundBitmap(catBitmap));
 * imageView1.setImageBitmap(ImageUtils.createRoundBitmap(catBitmap,true));
 * Bitmap dogBitmap = BitmapFactory.decodeFile("/sdcard/smalldog.jpg");
 * imageView2.setImageBitmap(ImageUtils.createRoundBitmap(dogBitmap,false,3, Color.RED));
 * imageView3.setImageBitmap(ImageUtils.createRoundBitmap(dogBitmap,true,3,Color.GRAY));
 */

public class ImageUtils {

    /**
     * 生成圆形图片 从上或左截取的图片，无描边
     *
     * @param srcBitmap 提供的或源Bitmap
     * @return 生成的圆形图片
     */
    public static Bitmap createRoundBitmap(Bitmap srcBitmap) {
        return createRoundBitmap(srcBitmap, false, 0, 0);
    }

    /**
     * 生成圆形图片,无描边
     *
     * @param srcBitmap    提供的或源Bitmap
     * @param isCenterClip 是否从图片中心裁取,默认为左或上
     * @return 生成的圆形图片
     */
    public static Bitmap createRoundBitmap(Bitmap srcBitmap, boolean isCenterClip) {
        return createRoundBitmap(srcBitmap, isCenterClip, 0, 0);
    }

    /**
     * 生成圆形图片
     *
     * @param srcBitmap    提供的或源Bitmap
     * @param isCenterClip 是否从图片中心裁取,默认为左或上
     * @param strokeWidth  描边的宽度
     * @param strokeColor  描边的高度
     * @return 生成的圆形图片
     */
    public static Bitmap createRoundBitmap(Bitmap srcBitmap, boolean isCenterClip, int strokeWidth, int strokeColor) {
        int srcBitmapWidth = srcBitmap.getWidth();
        int srcBitmapHeight = srcBitmap.getHeight();
        boolean isY;//是否根据y轴来切
        int targetLength = (isY = srcBitmapWidth < srcBitmapHeight) ? srcBitmapWidth : srcBitmapHeight;//取图片较短的边来作为要生成图片的长和宽
        Bitmap targetBitmap = Bitmap.createBitmap(targetLength + strokeWidth * 2, targetLength + strokeWidth * 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(targetBitmap);
        canvas.save();//保存画布,为画布移动作准备
        canvas.translate(strokeWidth, strokeWidth);//移动画布,为的是生成圆形头像居中
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        RectF dstRectF = new RectF(0, 0, targetLength, targetLength);
        canvas.drawRoundRect(dstRectF, targetLength / 2, targetLength / 2, paint);//创建一个矩阵圆
        Rect srcRect;//源图片要截取对应的矩阵
        if (isCenterClip) {
            if (isY) {
                srcRect = new Rect(0, (srcBitmapHeight - targetLength) / 2, targetLength, (srcBitmapHeight - targetLength) / 2 + targetLength);
            } else {
                srcRect = new Rect((srcBitmapWidth - targetLength) / 2, 0, (srcBitmapWidth - targetLength) / 2 + targetLength, targetLength);
            }
        } else {
            srcRect = new Rect(0, 0, targetLength, targetLength);
        }
        //关键方法,用于合成圆形图片，若有不明白的，可参照：http://blog.csdn.net/wangduanqing5945/article/details/38796269
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(srcBitmap, srcRect, dstRectF, paint);
        if (strokeWidth > 0) {
            canvas.restore();//对应canvas.save()来使用,为了恢复画布,为描边做准备
            Paint strokePaint = new Paint();//描边的画笔
            strokePaint.setAntiAlias(true);
            strokePaint.setStyle(Paint.Style.STROKE);
            strokePaint.setColor(strokeColor);
            strokePaint.setStrokeWidth(strokeWidth);
            canvas.drawCircle(targetLength / 2 + strokeWidth, targetLength / 2 + strokeWidth, targetLength / 2, strokePaint);//描边就是画一个圆形
        }
        return targetBitmap;
    }
}

