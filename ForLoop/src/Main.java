public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 a 2% interest = " + calculateInterest(10000.0, 2.0));
//
//        for(int i=0; i<5; i++) {
//            System.out.println("Loop " + i + " hello!");
//        }
//
//        for(int i=2; i<9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, (double) i)));
//        }
//
//        System.out.println("*******************");
//
//        for(int i=8; i>=2; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, (double) i)));
//        }

        //Attempt
//        for(int n = 2; n < 15; n++) {
//            int count = 0;
//            if(isPrime(n) == true) {
//                System.out.println(n + " is a prime number.");
//                count++;
//            }
//            if(count >= 3) {
//                break;
//            }
//        }

        //Solution
        int count = 0;
        for(int i =10; i <50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }


    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
