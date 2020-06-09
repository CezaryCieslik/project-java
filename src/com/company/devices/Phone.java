package com.company.devices;

import com.company.URL;
import com.company.creatures.Human;

import java.util.List;

public class Phone extends Device {
    public String system;

    static final String defaultAppServer = "test.com";
    static final String defaultAppProtocol = "https:";
    static final String deafultAppVersion = "alpha";

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producent='" + producent + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Ding ding...");
    }

    /*@Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if (seller.canSellDevice(this) && buyer.canBuyDevice(this,price)){
            buyer.cash -= price;
            seller.cash += price;
            seller.removeIphone(this);
            buyer.setIphone(this);
            System.out.println("Transaction was successful.");
        } else System.out.println("Transaction failed.");
    }*/

    public void installAnApp(String appName){
        installAnApp(appName, defaultAppServer, deafultAppVersion);
    }

    public void installAnApp(String appName, String appVersion ){
        installAnApp(appName, appVersion, defaultAppServer);
    }

    public void installAnApp(String appName, String appVersion, String appServer){
        System.out.println("Installed: "+ appName + " Version: " + appVersion + " From: " + appServer);
    }

    public void installAnApp(List<String> appNames){
        for (String applicationName : appNames ){
            installAnApp(applicationName);
        }
    }

    public void installAnApp(URL appInfo){
        installAnApp(appInfo.getAppName(), appInfo.getAppVersion(), appInfo.getAppServer());
    }
}
