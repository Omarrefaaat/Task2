package com.Vehicle;
public class DataBaseOperation {
    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void storeVehicleIntoDataBase (String vehicleName){
        System.out.println(String.format("Connecting into database with url=%s , username=%s, password=%s ",url,username,password));
        System.out.println(String.format("Store Vehicle Into Data Base " , vehicleName));
    }
}
