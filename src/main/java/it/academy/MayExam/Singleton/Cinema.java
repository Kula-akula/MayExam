package it.academy.MayExam.Singleton;

import java.util.Date;

public class Cinema implements FactoryItem{
    private static Cinema instance;
    private String name;
    private Integer capacity;
    private String address;
    private String webSite;

    private Cinema(String name, Integer capacity, String address, String webSite) {
        this.name = name;
        this.capacity = capacity;
        this.address = address;
        this.webSite = webSite;
    }

    public static Cinema getInstance() {
        if (instance == null) {
            synchronized (Cinema.class) {
                if (instance == null) {
                    instance = new Cinema("Broadway", 200, "Asia Mall", "www.broadway.kg");
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
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
}
