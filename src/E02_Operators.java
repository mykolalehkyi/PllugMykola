public class E02_Operators {
    public static void main(String[] args) {
        int a = 4 + 3;
        System.out.println("a: " + a);
        int b = 3 - 6 * 8;
        System.out.println("b: " + b);
        int c = 4 >> 2;
        System.out.println("c: " + c);
        int d = 4 << 2;
        System.out.println("d: " + d);
        int e = -1 >>> 1;
        System.out.println("e: " + e);

        System.out.println("\nbinary -1: " + Integer.toBinaryString(-1));
        System.out.println("binary -1 >>> 1: " + Integer.toBinaryString(e));
//        11111111111111111111111111111111
//        01111111111111111111111111111111

        float f = 4 / 6.5f;
        System.out.println("f: " + f);

        System.out.println("\nbinary 4: " + Integer.toBinaryString(4));
        System.out.println("binary 6: " + Integer.toBinaryString(6));
        int g = 4 & 6;
        System.out.println("binary g: " + Integer.toBinaryString(g));

        System.out.println("\nbinary 3: 00" + Integer.toBinaryString(3));
        System.out.println("binary 8: " + Integer.toBinaryString(8));
        int h = 3 | 8;
        System.out.println("binary h: " + Integer.toBinaryString(h));

        boolean i = true && false;
        System.out.println("i: " + i);
        boolean j = true || false;
        System.out.println("j: " + j);


        double sqr5 = Math.sqrt(5);
        System.out.println("sqr5: " + sqr5);

    }
}
