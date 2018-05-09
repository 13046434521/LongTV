package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/6 00:25
 * 描述：全民推荐Bean
 */
public class QmRecommendBean {

    private List<RoomBean> room;
    private List<?> ad;

    public List<RoomBean> getRoom() {
        return room;
    }

    public void setRoom(List<RoomBean> room) {
        this.room = room;
    }

    public List<?> getAd() {
        return ad;
    }

    public void setAd(List<?> ad) {
        this.ad = ad;
    }

    public static class RoomBean {
        /**
         * id : 0
         * name : 精彩推荐
         * is_default : 1
         * icon :
         * slug :
         * category_more :
         * type : 1
         * screen : 0
         * list : [{"first_play_at":"1970-01-01 08:00:00","category_name":"绝地求生","oldNo":"","room_tag":"","screen":0,"is_signed":0,"view":"69029","other_sub":"{\"isWeekStar\":0,\"guessing\":0,\"roomLot\":1,\"isPk\":0,\"nobleRecommend\":0,\"pugAlive\":-5,\"hot\":0}","slug":null,"live_thumb":"http://snap.quanmin.tv/1908054820-1525537267-623.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":null,"weight":0,"categoryid_lvl1":1,"starlight":99,"check":true,"play_count":0,"play_true":0,"block_image":"","default_image":"","position":"外太空","status":2,"cid":6,"coin":99,"frame":"","beauty_cover":"","no":27428286,"gender":1,"thumb":"http://snap.quanmin.tv/1908054820-1525537267-623.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","video":"http://thumb.quanmin.tv/1908054820.mp4?t=1525537200","title":"三锤，犹豫啥 点进来啊？","recommend_image":"","dw_dim_category":"{\"categoryIdLvl1\":1,\"categoryNameLvl1\":\"游戏\",\"srcCategoryId\":68}","is_shield":false,"nick":"三三三锤","uid":1908054820,"category_id":68,"stream":"http://liveal.quanmin.tv/live/1908054820.flv","room_config_sub":"","avatar":"http://a.img.shouyintv.cn/Wt93401-normal","follow":713,"fans":0,"max_view":0,"last_end_at":"1970-01-01 08:00:00","create_at":"2018-05-05 18:18:01","last_thumb":"1908054820-1525460825-835.jpg","landscape":1,"category_slug":"juediqiusheng","anniversary":0,"play_status":true,"link":"http://www.quanmin.tv/27428286","icontext":""},{"first_play_at":"1970-01-01 08:00:00","category_name":"王者荣耀","oldNo":"","room_tag":"","screen":0,"is_signed":0,"view":"60629","other_sub":"{\"isWeekStar\":0,\"guessing\":0,\"roomLot\":0,\"isPk\":0,\"nobleRecommend\":0,\"pugAlive\":0,\"hot\":1}","slug":"xu22414866","live_thumb":"http://snap.quanmin.tv/1136589600-1525537291-681.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":null,"weight":0,"categoryid_lvl1":1,"starlight":38616,"check":true,"play_count":0,"play_true":0,"block_image":"","default_image":"","position":"外太空","status":2,"cid":6,"coin":38616,"frame":"","beauty_cover":"","no":22414866,"gender":1,"thumb":"http://snap.quanmin.tv/1136589600-1525537291-681.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","video":"http://thumb.quanmin.tv/1136589600.mp4?t=1525537200","title":"5排开车守护上车了！","recommend_image":"","dw_dim_category":"{\"categoryIdLvl1\":1,\"categoryNameLvl1\":\"游戏\",\"srcCategoryId\":17}","is_shield":false,"nick":"藜藜藜","uid":1136589600,"category_id":17,"stream":"http://liveal.quanmin.tv/live/1136589600.flv","room_config_sub":"","avatar":"http://a.img.shouyintv.cn/XktH401-normal","follow":18544,"fans":0,"max_view":0,"last_end_at":"1970-01-01 08:00:00","create_at":"2018-05-05 19:56:31","last_thumb":"1136589600-1525454852-124.jpg","landscape":1,"category_slug":"wangzhe","anniversary":0,"play_status":true,"link":"http://www.quanmin.tv/v/xu22414866","icontext":""},{"first_play_at":"1970-01-01 08:00:00","category_name":"逆战","oldNo":"","room_tag":"","screen":0,"is_signed":0,"view":"48580","other_sub":"{\"isWeekStar\":0,\"guessing\":0,\"roomLot\":0,\"isPk\":0,\"nobleRecommend\":0,\"pugAlive\":0,\"hot\":0}","slug":null,"live_thumb":"http://snap.quanmin.tv/5251762-1525537265-283.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":"234","weight":0,"categoryid_lvl1":1,"starlight":3143,"check":true,"play_count":0,"play_true":0,"block_image":"","default_image":"","position":"外太空","status":2,"cid":6,"coin":3143,"frame":"","beauty_cover":"","no":7330012,"gender":-1,"thumb":"http://snap.quanmin.tv/5251762-1525537265-283.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","video":"http://thumb.quanmin.tv/5251762.mp4?t=1525537200","title":"次鸡鸡~","recommend_image":"","dw_dim_category":"{\"categoryIdLvl1\":1,\"categoryNameLvl1\":\"游戏\",\"srcCategoryId\":47}","is_shield":false,"nick":"大南无","uid":5251762,"category_id":47,"stream":"http://liveal.quanmin.tv/live/5251762_quanmin820.flv","room_config_sub":"","avatar":"http://a.img.shouyintv.cn/0JG6401-normal","follow":54512,"fans":0,"max_view":0,"last_end_at":"1970-01-01 08:00:00","create_at":"2018-05-06 00:01:56","last_thumb":"5251762-1525536005-179.jpg","landscape":1,"category_slug":"nizhan","anniversary":0,"play_status":true,"link":"http://www.quanmin.tv/7330012","icontext":""},{"first_play_at":"1970-01-01 08:00:00","category_name":"绝地求生","oldNo":"","room_tag":"","recommend_new_image":"http://static01.quanmin.tv/201712/d2fadeed-d838-414a-8b14-f3c667086d1f.jpg","screen":0,"is_signed":1,"view":"590336","other_sub":"{\"isWeekStar\":0,\"guessing\":0,\"roomLot\":1,\"isPk\":0,\"nobleRecommend\":0,\"pugAlive\":-5,\"hot\":0}","slug":"","live_thumb":"http://snap.quanmin.tv/3642200-1525537266-117.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":"432","weight":0,"categoryid_lvl1":1,"starlight":10608,"check":true,"play_count":0,"play_true":0,"block_image":"","default_image":"","position":"外太空","status":2,"cid":6,"coin":10608,"frame":"","beauty_cover":"","no":3642200,"gender":-1,"thumb":"http://snap.quanmin.tv/3642200-1525537266-117.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","video":"http://thumb.quanmin.tv/3642200.mp4?t=1525537200","title":"训练赛","recommend_image":"","dw_dim_category":"{\"categoryIdLvl1\":1,\"categoryNameLvl1\":\"游戏\",\"srcCategoryId\":68}","is_shield":false,"nick":"酱酱油阿","uid":3642200,"category_id":68,"stream":"http://liveal.quanmin.tv/live/3642200_quanmin820.flv","room_config_sub":"","avatar":"http://image.quanmin.tv/avatar/590e42e4677ebf7ce8ae9eb4db530fa5jpg?imageView2/2/w/300/","follow":574169,"fans":0,"max_view":0,"last_end_at":"1970-01-01 08:00:00","app_shuffling_image":"http://static01.quanmin.tv/201712/40a4be41-75b4-4fc2-8357-db14e80c7a58.jpg","create_at":"2018-05-05 18:56:50","last_thumb":"3642200-1525426685-229.jpg","landscape":1,"category_slug":"juediqiusheng","anniversary":0,"play_status":true,"link":"http://www.quanmin.tv/3642200","icontext":""},{"first_play_at":"1970-01-01 08:00:00","category_name":"绝地求生","oldNo":"","room_tag":"","recommend_new_image":"http://static01.quanmin.tv/201802/2f6e5aca-d077-4fb4-8cca-bb313f0bbef0.jpg","screen":0,"is_signed":1,"view":"580918","other_sub":"{\"isWeekStar\":0,\"guessing\":0,\"roomLot\":0,\"isPk\":0,\"nobleRecommend\":0,\"pugAlive\":3,\"hot\":0}","slug":"","live_thumb":"http://snap.quanmin.tv/259291-1525537290-759.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":"432","weight":0,"categoryid_lvl1":1,"starlight":28410,"check":true,"play_count":0,"play_true":0,"block_image":"","default_image":"","position":"","status":2,"cid":6,"coin":28410,"frame":"","beauty_cover":"","no":259291,"gender":-1,"thumb":"http://snap.quanmin.tv/259291-1525537290-759.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","video":"http://thumb.quanmin.tv/259291.mp4?t=1525537200","title":" 泽：训练赛","recommend_image":"","dw_dim_category":"{\"categoryIdLvl1\":1,\"categoryNameLvl1\":\"游戏\",\"srcCategoryId\":68}","is_shield":false,"nick":"全民丶伊泽","uid":259291,"category_id":68,"stream":"http://liveal.quanmin.tv/live/259291_quanmin820.flv","room_config_sub":"","avatar":"http://a.img.shouyintv.cn/J6r4401-normal","follow":485497,"fans":0,"max_view":0,"last_end_at":"1970-01-01 08:00:00","app_shuffling_image":"http://static01.quanmin.tv/201712/6b133779-279e-4412-b7c4-48b4f325c628.jpg","create_at":"2018-05-05 18:59:32","last_thumb":"259291-1525426647-721.jpg","landscape":1,"category_slug":"juediqiusheng","anniversary":0,"play_status":true,"link":"http://www.quanmin.tv/259291","icontext":""},{"first_play_at":"1970-01-01 08:00:00","category_name":"英雄联盟","oldNo":"","room_tag":"","recommend_new_image":"http://static01.quanmin.tv/201803/1971b5c4-8f75-4cea-82c9-75544f53789d.jpg","screen":0,"is_signed":1,"view":"561715","other_sub":"{\"isWeekStar\":0,\"guessing\":0,\"roomLot\":0,\"isPk\":0,\"nobleRecommend\":0,\"pugAlive\":0,\"hot\":0}","slug":"","live_thumb":"http://snap.quanmin.tv/1688553-1525537290-596.jpg?imageView2/2/w/390/","love_cover":"","level":0,"like":0,"video_quality":"234","weight":0,"categoryid_lvl1":1,"starlight":50339,"check":true,"play_count":0,"play_true":0,"block_image":"","default_image":"","position":"","status":2,"cid":6,"coin":50339,"frame":"","beauty_cover":"","no":1688553,"gender":-1,"thumb":"http://snap.quanmin.tv/1688553-1525537290-596.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","video":"http://thumb.quanmin.tv/1688553.mp4?t=1525537200","title":"八路奶粉：公认的世界第一蛮王，了解一哈？","recommend_image":"","dw_dim_category":"{\"categoryIdLvl1\":1,\"categoryNameLvl1\":\"游戏\",\"srcCategoryId\":1}","is_shield":false,"nick":"八路奶粉zzzz","uid":1688553,"category_id":1,"stream":"http://liveal.quanmin.tv/live/1688553.flv","room_config_sub":"","avatar":"http://image.quanmin.tv/avatar/753be4b6ff7b6c7a0e8814e0c7d50a30jpg?imageView2/2/w/300/","follow":332369,"fans":0,"max_view":0,"last_end_at":"1970-01-01 08:00:00","app_shuffling_image":"http://static01.quanmin.tv/201803/44dbf541-6af8-4309-8367-743f58d8c234.jpg","create_at":"2018-05-05 20:21:47","last_thumb":"1688553-1525455509-917.jpg","landscape":1,"category_slug":"lol","anniversary":0,"play_status":true,"link":"http://www.quanmin.tv/1688553","icontext":""}]
         */

        private int id;
        private String name;
        private int is_default;
        private String icon;
        private String slug;
        private String category_more;
        private int type;
        private int screen;
        private List<ListBean> list;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIs_default() {
            return is_default;
        }

        public void setIs_default(int is_default) {
            this.is_default = is_default;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getCategory_more() {
            return category_more;
        }

        public void setCategory_more(String category_more) {
            this.category_more = category_more;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getScreen() {
            return screen;
        }

        public void setScreen(int screen) {
            this.screen = screen;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * first_play_at : 1970-01-01 08:00:00
             * category_name : 绝地求生
             * oldNo :
             * room_tag :
             * screen : 0
             * is_signed : 0
             * view : 69029
             * other_sub : {"isWeekStar":0,"guessing":0,"roomLot":1,"isPk":0,"nobleRecommend":0,"pugAlive":-5,"hot":0}
             * slug : null
             * live_thumb : http://snap.quanmin.tv/1908054820-1525537267-623.jpg?imageView2/2/w/390/
             * love_cover :
             * level : 0
             * like : 0
             * video_quality : null
             * weight : 0
             * categoryid_lvl1 : 1
             * starlight : 99
             * check : true
             * play_count : 0
             * play_true : 0
             * block_image :
             * default_image :
             * position : 外太空
             * status : 2
             * cid : 6
             * coin : 99
             * frame :
             * beauty_cover :
             * no : 27428286
             * gender : 1
             * thumb : http://snap.quanmin.tv/1908054820-1525537267-623.jpg?imageView2/2/w/390/
             * last_play_at : 1970-01-01 08:00:00
             * video : http://thumb.quanmin.tv/1908054820.mp4?t=1525537200
             * title : 三锤，犹豫啥 点进来啊？
             * recommend_image :
             * dw_dim_category : {"categoryIdLvl1":1,"categoryNameLvl1":"游戏","srcCategoryId":68}
             * is_shield : false
             * nick : 三三三锤
             * uid : 1908054820
             * category_id : 68
             * stream : http://liveal.quanmin.tv/live/1908054820.flv
             * room_config_sub :
             * avatar : http://a.img.shouyintv.cn/Wt93401-normal
             * follow : 713
             * fans : 0
             * max_view : 0
             * last_end_at : 1970-01-01 08:00:00
             * create_at : 2018-05-05 18:18:01
             * last_thumb : 1908054820-1525460825-835.jpg
             * landscape : 1
             * category_slug : juediqiusheng
             * anniversary : 0
             * play_status : true
             * link : http://www.quanmin.tv/27428286
             * icontext :
             * recommend_new_image : http://static01.quanmin.tv/201712/d2fadeed-d838-414a-8b14-f3c667086d1f.jpg
             * app_shuffling_image : http://static01.quanmin.tv/201712/40a4be41-75b4-4fc2-8357-db14e80c7a58.jpg
             */

            private String first_play_at;
            private String category_name;
            private String oldNo;
            private String room_tag;
            private int screen;
            private int is_signed;
            private String view;
            private String other_sub;
            private Object slug;
            private String live_thumb;
            private String love_cover;
            private int level;
            private int like;
            private Object video_quality;
            private int weight;
            private int categoryid_lvl1;
            private int starlight;
            private boolean check;
            private int play_count;
            private int play_true;
            private String block_image;
            private String default_image;
            private String position;
            private int status;
            private int cid;
            private int coin;
            private String frame;
            private String beauty_cover;
            private int no;
            private int gender;
            private String thumb;
            private String last_play_at;
            private String video;
            private String title;
            private String recommend_image;
            private String dw_dim_category;
            private boolean is_shield;
            private String nick;
            private int uid;
            private int category_id;
            private String stream;
            private String room_config_sub;
            private String avatar;
            private int follow;
            private int fans;
            private int max_view;
            private String last_end_at;
            private String create_at;
            private String last_thumb;
            private int landscape;
            private String category_slug;
            private int anniversary;
            private boolean play_status;
            private String link;
            private String icontext;
            private String recommend_new_image;
            private String app_shuffling_image;

            public String getFirst_play_at() {
                return first_play_at;
            }

            public void setFirst_play_at(String first_play_at) {
                this.first_play_at = first_play_at;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getOldNo() {
                return oldNo;
            }

            public void setOldNo(String oldNo) {
                this.oldNo = oldNo;
            }

            public String getRoom_tag() {
                return room_tag;
            }

            public void setRoom_tag(String room_tag) {
                this.room_tag = room_tag;
            }

            public int getScreen() {
                return screen;
            }

            public void setScreen(int screen) {
                this.screen = screen;
            }

            public int getIs_signed() {
                return is_signed;
            }

            public void setIs_signed(int is_signed) {
                this.is_signed = is_signed;
            }

            public String getView() {
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public String getOther_sub() {
                return other_sub;
            }

            public void setOther_sub(String other_sub) {
                this.other_sub = other_sub;
            }

            public Object getSlug() {
                return slug;
            }

            public void setSlug(Object slug) {
                this.slug = slug;
            }

            public String getLive_thumb() {
                return live_thumb;
            }

            public void setLive_thumb(String live_thumb) {
                this.live_thumb = live_thumb;
            }

            public String getLove_cover() {
                return love_cover;
            }

            public void setLove_cover(String love_cover) {
                this.love_cover = love_cover;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getLike() {
                return like;
            }

            public void setLike(int like) {
                this.like = like;
            }

            public Object getVideo_quality() {
                return video_quality;
            }

            public void setVideo_quality(Object video_quality) {
                this.video_quality = video_quality;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getCategoryid_lvl1() {
                return categoryid_lvl1;
            }

            public void setCategoryid_lvl1(int categoryid_lvl1) {
                this.categoryid_lvl1 = categoryid_lvl1;
            }

            public int getStarlight() {
                return starlight;
            }

            public void setStarlight(int starlight) {
                this.starlight = starlight;
            }

            public boolean isCheck() {
                return check;
            }

            public void setCheck(boolean check) {
                this.check = check;
            }

            public int getPlay_count() {
                return play_count;
            }

            public void setPlay_count(int play_count) {
                this.play_count = play_count;
            }

            public int getPlay_true() {
                return play_true;
            }

            public void setPlay_true(int play_true) {
                this.play_true = play_true;
            }

            public String getBlock_image() {
                return block_image;
            }

            public void setBlock_image(String block_image) {
                this.block_image = block_image;
            }

            public String getDefault_image() {
                return default_image;
            }

            public void setDefault_image(String default_image) {
                this.default_image = default_image;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getCid() {
                return cid;
            }

            public void setCid(int cid) {
                this.cid = cid;
            }

            public int getCoin() {
                return coin;
            }

            public void setCoin(int coin) {
                this.coin = coin;
            }

            public String getFrame() {
                return frame;
            }

            public void setFrame(String frame) {
                this.frame = frame;
            }

            public String getBeauty_cover() {
                return beauty_cover;
            }

            public void setBeauty_cover(String beauty_cover) {
                this.beauty_cover = beauty_cover;
            }

            public int getNo() {
                return no;
            }

            public void setNo(int no) {
                this.no = no;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getRecommend_image() {
                return recommend_image;
            }

            public void setRecommend_image(String recommend_image) {
                this.recommend_image = recommend_image;
            }

            public String getDw_dim_category() {
                return dw_dim_category;
            }

            public void setDw_dim_category(String dw_dim_category) {
                this.dw_dim_category = dw_dim_category;
            }

            public boolean isIs_shield() {
                return is_shield;
            }

            public void setIs_shield(boolean is_shield) {
                this.is_shield = is_shield;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getStream() {
                return stream;
            }

            public void setStream(String stream) {
                this.stream = stream;
            }

            public String getRoom_config_sub() {
                return room_config_sub;
            }

            public void setRoom_config_sub(String room_config_sub) {
                this.room_config_sub = room_config_sub;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public int getFans() {
                return fans;
            }

            public void setFans(int fans) {
                this.fans = fans;
            }

            public int getMax_view() {
                return max_view;
            }

            public void setMax_view(int max_view) {
                this.max_view = max_view;
            }

            public String getLast_end_at() {
                return last_end_at;
            }

            public void setLast_end_at(String last_end_at) {
                this.last_end_at = last_end_at;
            }

            public String getCreate_at() {
                return create_at;
            }

            public void setCreate_at(String create_at) {
                this.create_at = create_at;
            }

            public String getLast_thumb() {
                return last_thumb;
            }

            public void setLast_thumb(String last_thumb) {
                this.last_thumb = last_thumb;
            }

            public int getLandscape() {
                return landscape;
            }

            public void setLandscape(int landscape) {
                this.landscape = landscape;
            }

            public String getCategory_slug() {
                return category_slug;
            }

            public void setCategory_slug(String category_slug) {
                this.category_slug = category_slug;
            }

            public int getAnniversary() {
                return anniversary;
            }

            public void setAnniversary(int anniversary) {
                this.anniversary = anniversary;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getIcontext() {
                return icontext;
            }

            public void setIcontext(String icontext) {
                this.icontext = icontext;
            }

            public String getRecommend_new_image() {
                return recommend_new_image;
            }

            public void setRecommend_new_image(String recommend_new_image) {
                this.recommend_new_image = recommend_new_image;
            }

            public String getApp_shuffling_image() {
                return app_shuffling_image;
            }

            public void setApp_shuffling_image(String app_shuffling_image) {
                this.app_shuffling_image = app_shuffling_image;
            }
        }
    }
}
