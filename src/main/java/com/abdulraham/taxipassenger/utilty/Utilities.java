package com.abdulraham.taxipassenger.utilty;

public class Utilities {
    public boolean isString(String param) {
        return param != null && !param.trim().isEmpty();

    }

    public boolean isEmail(String param) {
        return param != null && param.contains("@") && param.contains(".com");
    }

    public boolean isPassword(String param){
        return param != null && ! param.contains(" ") && ! param.isEmpty();
    }

    public boolean isPhoneNum(String param){
        return param != null && ! param.contains(" ") && param.length()==10 ;
    }
}
