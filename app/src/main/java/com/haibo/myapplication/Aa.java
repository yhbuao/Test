package com.haibo.myapplication;

import java.util.List;

/**
 * 项目名称: MyApplication.
 * 创建人: yuhaibo
 * 创建时间: 2016/11/10 14:21.
 */

public class Aa {
    /**
     * endRowNum : 36
     * firstPage : true
     * lastPage : true
     * nextPageNum : 1
     * orderby : 1
     * pageNum : 1
     * pageSize : 36
     * prePageNum : 1
     * returnCondition : true
     * startRowNum : 0
     * totalPageNum : 1
     * totalRowNum : 36
     */

    private ConditionBean condition;
    /**
     * authorid : ***
     * authorname : 神秘作者待揭晓
     * bookshelfid : ff80808158007630015800cd72410010
     * cover : http://app.xhhread.com/resources/images/covers/gy_book_cover_zttl.png
     * createtime : 2016-10-26 19:43:33
     * dorder : -34
     * groupid : grp1
     * isfinish : null
     * isnew : 0
     * items : null
     * lastchapter :
     * lastreadtime : null
     * name : 白漠之上
     * outline : 南极边缘的白色荒原上，“托尼斯克号”孤寂地漂浮着，被困的人们无助地苟延残喘。刚刚舍身救下大家的马力，后脑却受到了致命的打击，面对食材即将耗尽的严酷现实，所有人都面临生死抉择。
     * readChapterName :
     * readChapterid :
     * readPosition :
     * stages : [{"categoryid":"c6","categoryname":"","finishtime":"2016-11-05 23:00:00","isfinish":0,"isopen":1,"month":10,"publishtime":"2016-10-25 09:39:21","stageid":"8aada63957d54da70157e6d5dd51004d","stagename":"内测","stageno":"E","winstoryid":"","year":2016}]
     * storyid : 8aada63957d54da70157e6f89c3c0057
     * storytype : 1
     * type : 1
     * updatetime : null
     */

    private List<DatasBean> datas;

    public ConditionBean getCondition() {
        return condition;
    }

    public void setCondition(ConditionBean condition) {
        this.condition = condition;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class ConditionBean {
        private int endRowNum;
        private boolean firstPage;
        private boolean lastPage;
        private int nextPageNum;
        private int orderby;
        private int pageNum;
        private int pageSize;
        private int prePageNum;
        private boolean returnCondition;
        private int startRowNum;
        private int totalPageNum;
        private int totalRowNum;

        public int getEndRowNum() {
            return endRowNum;
        }

        public void setEndRowNum(int endRowNum) {
            this.endRowNum = endRowNum;
        }

        public boolean isFirstPage() {
            return firstPage;
        }

        public void setFirstPage(boolean firstPage) {
            this.firstPage = firstPage;
        }

        public boolean isLastPage() {
            return lastPage;
        }

        public void setLastPage(boolean lastPage) {
            this.lastPage = lastPage;
        }

        public int getNextPageNum() {
            return nextPageNum;
        }

        public void setNextPageNum(int nextPageNum) {
            this.nextPageNum = nextPageNum;
        }

        public int getOrderby() {
            return orderby;
        }

        public void setOrderby(int orderby) {
            this.orderby = orderby;
        }

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getPrePageNum() {
            return prePageNum;
        }

        public void setPrePageNum(int prePageNum) {
            this.prePageNum = prePageNum;
        }

        public boolean isReturnCondition() {
            return returnCondition;
        }

        public void setReturnCondition(boolean returnCondition) {
            this.returnCondition = returnCondition;
        }

        public int getStartRowNum() {
            return startRowNum;
        }

        public void setStartRowNum(int startRowNum) {
            this.startRowNum = startRowNum;
        }

        public int getTotalPageNum() {
            return totalPageNum;
        }

        public void setTotalPageNum(int totalPageNum) {
            this.totalPageNum = totalPageNum;
        }

        public int getTotalRowNum() {
            return totalRowNum;
        }

        public void setTotalRowNum(int totalRowNum) {
            this.totalRowNum = totalRowNum;
        }
    }

    public static class DatasBean {
        private String authorid;
        private String authorname;
        private String bookshelfid;
        private String cover;
        private String createtime;
        private int dorder;
        private String groupid;
        private Object isfinish;
        private int isnew;
        private Object items;
        private String lastchapter;
        private Object lastreadtime;
        private String name;
        private String outline;
        private String readChapterName;
        private String readChapterid;
        private String readPosition;
        private String storyid;
        private int storytype;
        private int type;
        private Object updatetime;
        /**
         * categoryid : c6
         * categoryname :
         * finishtime : 2016-11-05 23:00:00
         * isfinish : 0
         * isopen : 1
         * month : 10
         * publishtime : 2016-10-25 09:39:21
         * stageid : 8aada63957d54da70157e6d5dd51004d
         * stagename : 内测
         * stageno : E
         * winstoryid :
         * year : 2016
         */

        private List<StagesBean> stages;

        public String getAuthorid() {
            return authorid;
        }

        public void setAuthorid(String authorid) {
            this.authorid = authorid;
        }

        public String getAuthorname() {
            return authorname;
        }

        public void setAuthorname(String authorname) {
            this.authorname = authorname;
        }

        public String getBookshelfid() {
            return bookshelfid;
        }

        public void setBookshelfid(String bookshelfid) {
            this.bookshelfid = bookshelfid;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public int getDorder() {
            return dorder;
        }

        public void setDorder(int dorder) {
            this.dorder = dorder;
        }

        public String getGroupid() {
            return groupid;
        }

        public void setGroupid(String groupid) {
            this.groupid = groupid;
        }

        public Object getIsfinish() {
            return isfinish;
        }

        public void setIsfinish(Object isfinish) {
            this.isfinish = isfinish;
        }

        public int getIsnew() {
            return isnew;
        }

        public void setIsnew(int isnew) {
            this.isnew = isnew;
        }

        public Object getItems() {
            return items;
        }

        public void setItems(Object items) {
            this.items = items;
        }

        public String getLastchapter() {
            return lastchapter;
        }

        public void setLastchapter(String lastchapter) {
            this.lastchapter = lastchapter;
        }

        public Object getLastreadtime() {
            return lastreadtime;
        }

        public void setLastreadtime(Object lastreadtime) {
            this.lastreadtime = lastreadtime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOutline() {
            return outline;
        }

        public void setOutline(String outline) {
            this.outline = outline;
        }

        public String getReadChapterName() {
            return readChapterName;
        }

        public void setReadChapterName(String readChapterName) {
            this.readChapterName = readChapterName;
        }

        public String getReadChapterid() {
            return readChapterid;
        }

        public void setReadChapterid(String readChapterid) {
            this.readChapterid = readChapterid;
        }

        public String getReadPosition() {
            return readPosition;
        }

        public void setReadPosition(String readPosition) {
            this.readPosition = readPosition;
        }

        public String getStoryid() {
            return storyid;
        }

        public void setStoryid(String storyid) {
            this.storyid = storyid;
        }

        public int getStorytype() {
            return storytype;
        }

        public void setStorytype(int storytype) {
            this.storytype = storytype;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(Object updatetime) {
            this.updatetime = updatetime;
        }

        public List<StagesBean> getStages() {
            return stages;
        }

        public void setStages(List<StagesBean> stages) {
            this.stages = stages;
        }

        public static class StagesBean {
            private String categoryid;
            private String categoryname;
            private String finishtime;
            private int isfinish;
            private int isopen;
            private int month;
            private String publishtime;
            private String stageid;
            private String stagename;
            private String stageno;
            private String winstoryid;
            private int year;

            public String getCategoryid() {
                return categoryid;
            }

            public void setCategoryid(String categoryid) {
                this.categoryid = categoryid;
            }

            public String getCategoryname() {
                return categoryname;
            }

            public void setCategoryname(String categoryname) {
                this.categoryname = categoryname;
            }

            public String getFinishtime() {
                return finishtime;
            }

            public void setFinishtime(String finishtime) {
                this.finishtime = finishtime;
            }

            public int getIsfinish() {
                return isfinish;
            }

            public void setIsfinish(int isfinish) {
                this.isfinish = isfinish;
            }

            public int getIsopen() {
                return isopen;
            }

            public void setIsopen(int isopen) {
                this.isopen = isopen;
            }

            public int getMonth() {
                return month;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            public String getPublishtime() {
                return publishtime;
            }

            public void setPublishtime(String publishtime) {
                this.publishtime = publishtime;
            }

            public String getStageid() {
                return stageid;
            }

            public void setStageid(String stageid) {
                this.stageid = stageid;
            }

            public String getStagename() {
                return stagename;
            }

            public void setStagename(String stagename) {
                this.stagename = stagename;
            }

            public String getStageno() {
                return stageno;
            }

            public void setStageno(String stageno) {
                this.stageno = stageno;
            }

            public String getWinstoryid() {
                return winstoryid;
            }

            public void setWinstoryid(String winstoryid) {
                this.winstoryid = winstoryid;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }
        }
    }
}
