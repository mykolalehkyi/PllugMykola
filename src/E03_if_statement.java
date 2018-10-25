public class E03_if_statement {
    public static void main(String[] args) {
        //if statement
        if (3 / 2 == 1) {
            System.out.println(" 1 * 2 = 3 :)");
        }

        String s1 = "Test";
        String s2 = "Test";//new String("Test");
//        s1 = s1 + "d";
        if (s1 == s2) {
            System.out.println(" s1 == s2");
        } else {
            System.out.println(" s1 != s2");
        }
//                [Test]
//           s1 ->[Test] <- s2
//                [Testd]

        //big body
        if (true) {
            int a = 1 + 2;
            int b = a + 3;
            int c = b + 4;
            int d = c + 5;
            System.out.println(" 1 + 2 + ... + 5  = " + d);
        }

        //if-else
        if (4 > 5) {
            System.out.println("Wow 4 > 5!");
        } else {
            System.out.println("Nien!");
        }

        //if-else
        int way = 3;

        if (way == 1) {
            System.out.println("Rich");
        } else if (way == 2) {
            System.out.println("Married!");
        } else if (way == 3) {
            System.out.println("Married!");
        } else if (way == 4) {
            System.out.println("Married!");
        } else {
            System.out.println("Happy!");
        }

        switch (way) {
            case 1: System.out.println("Rich"); break;
            case 2:
            case 3:
            case 4:
                System.out.println("Married!"); break;
            default: System.out.println("Happy!"); break;
        }


        String s3 = new String("Test");
        switch (s3) {
            case "1": System.out.println("Rich"); break;
            case "Test":
            case "b":
            case "4":
                System.out.println("Married!"); break;
            default: System.out.println("Happy!"); break;
        }
        //switch with breaks
        String numberString;
        int numberValue = 2;

        switch (numberValue) {
            case 1:
                numberString = "one";
                break;
            case 2:
                numberString = "two";
                break;
            default:
                numberString = "a lot";
                break;
        }
        System.out.println("numberString: " + numberString);

        //switch with missed breaks
        switch (numberValue) {
            case 1:
                numberString = "one";
            case 2:
                numberString = "two";
            case 5:
                numberString = "a lot";
                break;
        }
        System.out.println("\nnumberString: " + numberString);
    }
}
