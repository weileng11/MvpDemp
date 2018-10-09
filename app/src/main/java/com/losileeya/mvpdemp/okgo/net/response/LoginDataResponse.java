package com.losileeya.mvpdemp.okgo.net.response;

/**
 * author:bruce
 * time: 2018/10/9 0009
 */

public class LoginDataResponse {

    /**
     * error :
     * user : {"updateDate":1538289105000,"showName":"李涛","sex":"","isCompany":"0","userName":"13828821554","userId":"54e5ea5486d748e3adf9ff5cb1fe5d0e","isThinkine":"1","guideFinish":"1","password":"09c6ed005d720d620c216a3d171244c0e301a6b3","cityName":"东城区","phone":"13828821554","name":"李涛","provinceName":"北京市","status":"1","isIM":"1","createDate":1508719089000}
     * status : success
     */

    private String error;
    private UserBean user;
    private String status;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class UserBean {
        /**
         * updateDate : 1538289105000
         * showName : 李涛
         * sex :
         * isCompany : 0
         * userName : 13828821554
         * userId : 54e5ea5486d748e3adf9ff5cb1fe5d0e
         * isThinkine : 1
         * guideFinish : 1
         * password : 09c6ed005d720d620c216a3d171244c0e301a6b3
         * cityName : 东城区
         * phone : 13828821554
         * name : 李涛
         * provinceName : 北京市
         * status : 1
         * isIM : 1
         * createDate : 1508719089000
         */

        private long updateDate;
        private String showName;
        private String sex;
        private String isCompany;
        private String userName;
        private String userId;
        private String isThinkine;
        private String guideFinish;
        private String password;
        private String cityName;
        private String phone;
        private String name;
        private String provinceName;
        private String status;
        private String isIM;
        private long createDate;

        public long getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(long updateDate) {
            this.updateDate = updateDate;
        }

        public String getShowName() {
            return showName;
        }

        public void setShowName(String showName) {
            this.showName = showName;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getIsCompany() {
            return isCompany;
        }

        public void setIsCompany(String isCompany) {
            this.isCompany = isCompany;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getIsThinkine() {
            return isThinkine;
        }

        public void setIsThinkine(String isThinkine) {
            this.isThinkine = isThinkine;
        }

        public String getGuideFinish() {
            return guideFinish;
        }

        public void setGuideFinish(String guideFinish) {
            this.guideFinish = guideFinish;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getIsIM() {
            return isIM;
        }

        public void setIsIM(String isIM) {
            this.isIM = isIM;
        }

        public long getCreateDate() {
            return createDate;
        }

        public void setCreateDate(long createDate) {
            this.createDate = createDate;
        }
    }
}
