public class E04_loop {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }

        //foreach
        String[] strings = new String[]{"one", "two", "three"};

        for (String number : strings) {
            System.out.println(number);
        }

        //while
        int counter = 0;
        while (counter < 20) {
            System.out.println("Still running loop" + counter);
            counter++;
        }

        //do-while
        do {
            System.out.println("\nBody will run at least once");
        } while (false);
//
//        //continue
        for (int i = 0; i < 10; i++) {
            System.out.print("enter: " + i);
            if (i > 5) {
                System.out.println(" & continue: ");
                continue;
            }
            System.out.println(" & exit: ");
        }

        //2x Loop
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t" + (i * j));
            }
            System.out.println("\n");
        }

    }
}
