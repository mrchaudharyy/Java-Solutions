package com.javasolutions.string;

public class ConvertDataTypeIntoStringFormat {

    public static void main(String[] args) {

        //convert from char
        char charValue = 'S';
        String value = String.valueOf(charValue);
        System.out.println("String converted from CHAR -> " + value);

        //convert from byte
        byte byteValue = 'S';
        String value1 = String.valueOf(byteValue);
        System.out.println("String converted from BYTE -> " + value1);

        //convert from short
        short shortValue = '5';
        String value2 = String.valueOf(shortValue);
        System.out.println("String converted from SHORT -> " + value2);

        //convert from int
        int intValue = 10;
        String value3 = String.valueOf(intValue);
        System.out.println("String converted from INT -> " + value3);

        //convert from float
        float floatValue = 15;
        String value4 = String.valueOf(floatValue);
        System.out.println("String converted from FLOAT -> " + value4);

        //convert from long
        long longValue = 12345;
        String value5 = String.valueOf(longValue);
        System.out.println("String converted from LONG -> " + value5);

        //convert from boolean
        boolean booleanValue = true;
        String value6 = String.valueOf(booleanValue);
        System.out.println("String converted from BOOLEAN -> " + value6);


    }
}
