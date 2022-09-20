package com.company;

import java.util.Locale;

public class alam_14_string_method {
    public static void main(String[] args) {
        String name = "Alam";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);

        // String lstring = name.toLowerCase();
        // System.out.println(lstring);

        // String ustring = name.toUpperCase();
        // System.out.println(ustring);

        // String nonTrimmedString = "     Alam    ";
        // System.out.println(nonTrimmedString);

        // String trimmedString = nonTrimmedString.trim();
        // System.out.println(trimmedString);


        // System.out.println(name.substring(1));
        // System.out.println(name.substring(1,4));

        // System.out.println(name.replace('a','p'));
        // System.out.println(name.replace("a","oor"));

        // System.out.println(name.startsWith("Ala"));
        // System.out.println(name.endsWith("Ala"));

        System.out.println(name.charAt(2));

        // String modifiedName = "Harryrryrry";
        // System.out.println(modifiedName.indexOf("rry"));
        // System.out.println(modifiedName.indexOf("rry", 4));
        //System.out.println(modifiedName.("rry",4));

        //System.out.println(name.equals("Alam"));lastIndexOf
        System.out.println(name.equalsIgnoreCase("Alam"));

        System.out.println("I am escape sequence \t double quote");

    }
}
