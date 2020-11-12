package com.example.validationforedittext;

public class ValidationForEditText {
    static public boolean emailIsValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
    static public boolean isOnlyCharacters(String name) {
        return name.matches("[a-zA-Z]+");
    }

    static public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
