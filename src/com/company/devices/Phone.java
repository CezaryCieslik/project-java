package com.company.devices;

import com.company.Application;
import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Phone extends Device {
    public String system;

    static final String defaultAppServer = "test.com";
    static final String defaultAppProtocol = "https:";
    static final String deafultAppVersion = "alpha";
    public HashSet<Application> installed_apps;
    public Human tester;

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producent='" + producent + '\'' +
                ", yearOfProduction=" + yearOfProduction + '\'' +
                ", value=" + value +
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
    }

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
    }*/

    public void installAnApp(Application application) throws Exception{
        if (tester.getCash()<application.getPrice()){
            System.out.println("U need more money.");
        }
        this.installed_apps.add(application);
        tester.setCash(tester.getCash() - value);
        System.out.println("Installed");
    }

    public void checkIfAlreadyInstalled(Application application){
        if (this.installed_apps.contains(application)){
            System.out.println("Installed.");
        }
    }

    public void checkIfInstalledByName(String appName){
        for(Application application : this.installed_apps) {
            if (application.getName().equals(appName)) {
                System.out.println("Installed.");
            }
        }
    }

    public void freeApps(){
        for ( Application application:installed_apps){
            if (application.price == 0.0){
                System.out.println(application.name);
            }
        }
    }

    List<Application> allApps = new ArrayList<Application>(installed_apps);
    public void sortAlphabetically(){
         this.allApps.sort(Comparator.comparing(Application::getName));
         System.out.println("Sorted Alphabetically "+ allApps);

    }
}
