package com.company;

public class URL {

    String appName;
    String appVersion;
    String appServer;

    public URL(String appName, String appVersion, String appServer){
        this.appName = appName;
        this.appVersion = appVersion;
        this.appServer = appServer;
    }

    public String getAppName(){
        return appName;
    }

    public  String getAppVersion(){
        return appVersion;
    }

    public String getAppServer(){
        return appServer;
    }
}
