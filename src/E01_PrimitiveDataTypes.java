public class E01_PrimitiveDataTypes {
    private byte byteNumber; // - 128 .. 127 8-bit
    private short shortNumber; // - 32_768 .. 32_767 16-bit
    private int intNumber; // - 2_147_483_648 .. 2_147_483_647 32-bit
    private long longNumber;     // - 9_223_372_036_854_775_808 ..
    // 9_223_372_036_854_775_807 64-bit

    private float floatNumber; // ± 4,402 * 10^38 32-bit
    private double doubleNumber; // ± 1,798 * 10^308 64-bit

    private char charSymbol; // Unicode U+0000 .. U+FFFF 16-bit

    private boolean isBoolean; // true or false

    public static void main(String[] args) {
        int decimal = 200;
        int octValue = 065;
        int hexValue = 0x34;
        int binaryValue = 0b1011101;//0135 //0x5D

        System.out.println("decimal : " + decimal);
        System.out.println("octValue : " + octValue);
        System.out.println("hexValue : " + hexValue);
        System.out.println("binaryValue : " + binaryValue);
        /*
        2     8
        000 - 0
        001 - 1
        010 - 2
        011 - 3
        100 - 4
        101 - 5
        110 - 6
        111 - 7
         */

        long longValue = 23L;
        long longValue2 = (long) 2334343;

        float floatValue1 = (float) 23.454;
        float floatValue2 = 3344.54545797F;

        double doubleValue1 = 45.786;
        double doubleValue2 = 45.786e199;
        double doubleValue3 = 1e100;

        char charValue = 'a' + 10;
        System.out.println("charValue : " + charValue);
    }
}
