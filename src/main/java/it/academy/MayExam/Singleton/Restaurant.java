package it.academy.MayExam.Singleton;

import java.util.Date;

public class Restaurant implements FactoryItem {

    private static Restaurant instance;
    private String name;
    private String fashionDish;
    private String address;
    private String webSite;

    private Restaurant(String name, String fashionDish, String address, String webSite) {
        this.name = name;
        this.fashionDish = fashionDish;
        this.address = address;
        this.webSite = webSite;
    }

    public static Restaurant getInstance() {
        if (instance == null) {
            synchronized (Restaurant.class) {
                if (instance == null) {
                    instance = new Restaurant("Navat", "Plov", "Asia Mall", "www.broadway.kg");
                }
            }
        }
        return instance;
    }

    @Override
    public void log() {
        Date loging=new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFashionDish() {
        return fashionDish;
    }

    public void setFashionDish(String fashionDish) {
        this.fashionDish = fashionDish;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", fashionDish='" + fashionDish + '\'' +
                ", address='" + address + '\'' +
                ", webSite='" + webSite + '\'' +
                '}';
    }
}
