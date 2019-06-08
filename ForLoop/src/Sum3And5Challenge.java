public class Sum3And5Challenge {


    public static void main(String[] args) {
//
//
//        //My Attempt
//        int count = 0;
//        int sum = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                count++;
//                sum += i;
//                if (count == 5) {
//                    System.out.println("Exiting loop");
//                    System.out.println("The sum is " + sum);
//                    break;
//                }
//            }
//        }
//    }


        //Solution
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if (count == 5) {
                break;
            }
        }

            System.out.println("Sum is " + sum);
        }

    }


