package lesson_02;

public class Task1 {

    public static void byteType() {
        System.out.println("byte"+"\n");
        byte byteType1 = -128;
        byte byteType2 = 127;

        System.out.println(byteType1);
        System.out.println(byteType2);

        System.out.println("-".repeat(20)+"\n");
    }

    public static void shortType() {
        System.out.println("short"+"\n");
        short shortType1 = -32768;
        short shortType2 = 32767;

        System.out.println(shortType1);
        System.out.println(shortType2);

        System.out.println("-".repeat(20)+"\n");
    }

    public static void intType() {
        System.out.println("int"+"\n");
        int intType1 = -2147483648;
        int intType2 = 2147483647;

        System.out.println(intType1);
        System.out.println(intType2);

        System.out.println("-".repeat(20)+"\n");
    }

    public static void longType() {
        System.out.println("long"+"\n");
        long longType1 = -9223372036854775808L;
        long longType2 = 922337203685477580L;

        System.out.println(longType1);
        System.out.println(longType2);

        System.out.println("-".repeat(20)+"\n");
    }

    public static void booleanType() {
        System.out.println("boolean"+"\n");
        boolean booleanType1 = true;
        boolean booleanType2 = false;

        System.out.println(booleanType1);
        System.out.println(booleanType2);

        System.out.println("-".repeat(20)+"\n");
    }

    public static void doubleType() {
        System.out.println("double"+"\n");
        double doubleType1 = 1.79769313486231570e+308;
        double doubleType2 = 4.94065645841246544e-324;

        System.out.println(doubleType1);
        System.out.println(doubleType2);

        System.out.println("-".repeat(20)+"\n");
    }

    public static void floatType() {
        System.out.println("float"+"\n");
        float floatType1 = -9.123456789123456789123456789F;
        float floatType2 = 9.123456789123456789123456789F;

        System.out.println(floatType1);
        System.out.println(floatType2);

        System.out.println("-".repeat(20)+"\n");
    }

    public static void charType() {
        System.out.println("char"+"\n");
        char charType1 = 'A';
        char charType2 = '$';
        char charType3Unicode = (char) 0x06D0;

        System.out.println(charType1);
        System.out.println(charType2);
        System.out.println(charType3Unicode);

        System.out.println("-".repeat(20)+"\n");
    }


    public static void main(String[] args) {
        byteType();
        shortType();
        intType();
        longType();
        booleanType();
        doubleType();
        floatType();
        charType();
    }

}
