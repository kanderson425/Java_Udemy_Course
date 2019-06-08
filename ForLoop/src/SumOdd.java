public class SumOdd {

    public static void main(String[] args) {

        sumOdd(2, 20);

    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && start > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum += i;
                    System.out.println("i = " + i);
                    System.out.println("Sum = " + sum);
                }

            }
            return sum;
        }
        return -1;
    }
}


//public class SumOddRange {
//
//        public static boolean isOdd(int number) {
//
//            if (number <= 0) {
//                return false;
//            }
//            return (number % 2 != 0);
//        }
//
//        public static int sumOdd(int start, int end) {
//            int sum = 0;
//            if (end >= start && start > 0) {
//                for (int i = start; i <= end; i++) {
//                    if (isOdd(i)) {
//                        sum += i;
//                    }
//                }
//                return sum;
//
//            }
//            return -1;
//        }
//}