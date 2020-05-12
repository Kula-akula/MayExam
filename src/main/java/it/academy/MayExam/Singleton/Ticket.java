package it.academy.MayExam.Singleton;

import java.util.Date;

public class Ticket implements  FactoryItem {
    private static Ticket instance;
    private String name;
    private String paymentType;
    private String webSite;

    private Ticket(String name, String paymentType, String webSite) {
        this.name = name;
        this.paymentType=paymentType;
        this.webSite = webSite;
    }

    public static Ticket getInstance() {
        if (instance == null) {
            synchronized (Ticket.class) {
                if (instance == null) {
                    instance = new Ticket("Ticketon", "web money",  "www.ticket.kg");
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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
