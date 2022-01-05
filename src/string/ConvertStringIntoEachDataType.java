package string;

public class ConvertStringIntoEachDataType {

    public static void main(String[] args) {

        //convert into char
        String value = "S";
        char charValue = value.charAt(0);
        System.out.println("Printing string in CHAR -> " + charValue);

        //convert into byte
        String value1 = "S";
        byte byteValue = value1.getBytes()[0];
        System.out.println("Printing string in BYTE -> " + byteValue);

        //convert into short
        String value2 = "10";
        short shortValue = Short.valueOf(value2);
        System.out.println("Printing string in SHORT -> " + shortValue);

        //convert into int
        String value3 = "10";
        int intValue = Integer.valueOf(value3);
        System.out.println("Printing string in INT -> " + intValue);

        //convert into float
        String value4 = "10.0";
        float floatValue = Float.valueOf(value4);
        System.out.println("Printing string in FLOAT -> " + floatValue);

        //convert into long
        String value5 = "10";
        long longValue = Long.valueOf(value5);
        System.out.println("Printing string in LONG -> " + longValue);

        //convert into boolean
        String value6 = "true";
        boolean booleanValue = Boolean.valueOf(value6);
        System.out.println("Printing string in BOOLEAN -> " + booleanValue);


    }
}
