package com.haibo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    protected WebView webview;
    protected TextView mTitle;
    private List<String> loadHistoryUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        webview = ((WebView) findViewById(R.id.webview));
        mTitle = ((TextView) findViewById(R.id.title));
        loadData();
    }


    public void loadData() {
        webview.loadUrl("http://app.xhhread.com/ad/getContentByAdid.i?adid=ad39");
        //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
        //启用支持javascript
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);
        webview.getSettings().setUseWideViewPort(true);//设置此属性，可任意比例缩放
        settings.setSupportZoom(true);//设定支持缩放
        settings.setBuiltInZoomControls(true);//缩放工具
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);//设定支持viewport
        webview.setVerticalScrollbarOverlay(true); //指定的垂直滚动条有叠加样式

        WebSettings webSettings = webview.getSettings(); // webView: 类WebView的实例

        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //设置默认缩放方式尺寸是far
        webview.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);

        //设置 缓存模式
        webview.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        // 开启 DOM storage API 功能
        webview.getSettings().setDomStorageEnabled(true);
        webview.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                // TODO Auto-generated method stub
                if (newProgress == 100) {
                    // 网页加载完成
                } else {
                    // 加载中
                }
            }

            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                mTitle.setText(title);
            }
        });
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                loadHistoryUrls.add(url);
            }
        });
    }


    /**
     * 改变返回键的功能,当网页中有需要返回的界面时,网页中优先
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (webview.canGoBack()) {
                if (loadHistoryUrls.size() > 1) {
                    //重新加载之前的页面,这里为了让标题也能正常显示
                    String url = loadHistoryUrls.get(loadHistoryUrls.size() - 2);
                    loadHistoryUrls.remove(loadHistoryUrls.size() - 1);
                    if (loadHistoryUrls.size() > 0) {
                        loadHistoryUrls.remove(loadHistoryUrls.size() - 1);
                    }
                    webview.loadUrl(url);
                    return true;
                }
            }
        }
        return super.onKeyDown(keyCode, event);
    }

}
