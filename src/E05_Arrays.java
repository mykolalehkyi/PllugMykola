public class E05_Arrays {
    public static void main(String[] args) {
        //initialize variable
        int[] anArray;
        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;

        //shortcut syntax to create and initialize an array:
        int[] anArray2 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        System.out.println(anArray2.length);

        int c = anArray2[anArray2.length - 1];

        int[] anArray3 = new int[10];
        for (int i = 0; i < anArray3.length; i++) {
            anArray3[i] = 100 * (i + 1);
        }
    }
}

class MultiDimArrayDemo {
    public static void main(String[] args) {
        int[][] multiplicationMatrix = new int[10][10];
        //2x Loop
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationMatrix[i][j] = i * j;
                System.out.print("\t" + (i * j));
            }
            System.out.println("\n");
        }

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
// Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
// Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}


class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}

class ArraysUtil {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo));
    }
}

