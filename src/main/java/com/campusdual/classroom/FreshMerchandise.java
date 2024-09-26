package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    public Date expirationDate;
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity,Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }
    public void printSpecificData(){
        System.out.println(this.getSpecificData());
    }
    public Date getExpirationDate(){return expirationDate;}
    @Override
    public String getSpecificData(){
        StringBuilder build = new StringBuilder();
        build.append("Location: ");
        build.append(this.getLocation());
        build.append(" Expiration date: ");
        build.append(this.getFormattedDate(this.getExpirationDate()));
        return  build.toString();
    }
    public String getFormattedDate(Date date){
        SimpleDateFormat dates = new SimpleDateFormat("dd-MM-yyyy");
        return dates.format(date);
    }
}
