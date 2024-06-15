public class Lesson {
    public static void main(String[] args) {

        int a = 8;
        int b = 4;
        int c = 6;

        //Task 22
        System.out.print("The minimum value is: ");
        if (a < b && a < c) {
            System.out.print(a);
        } else if (b < a && b < c) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
        System.out.println();

        //Task 23
        if (a == 1 || b == 1 || c == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 24
        if (a == 2 && b == 2 && c != 2 || a == 2 && b != 2 && c == 2 ||
                a != 2 && b == 2 && c == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 25
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("y=1");
        } else {
            System.out.println("y=2");
        }

        //Task 26
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        //Task 27
        if (b - a == c - b || c - a == b - c || //abc, acb
                a - b == c - a || c - b == a - c || //bac, bca
                a - c == b - a || b - c == a - b) { // cab, cba
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 28
        if (b / a == c / b || c / a == b / c || //abc, acb
                a / b == c / a || c / b == a / c || //bac, bca
                a / c == b / a || b / c == a / b) { // cab, cba
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Task 29
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            }
            else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            }
            else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c < a && c < b) {
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            }
            else {
                System.out.println(c + " " + b + " " + a);
            }
        }


        // Task 30
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            }
            else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            }
            else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            }
            else {
                System.out.println(c + " " + b + " " + a);
            }
        }

    }
}
