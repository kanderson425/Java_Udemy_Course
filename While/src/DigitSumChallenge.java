public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(777));
    }

//    //My Attempt
//    public static int sumDigits(int parameter) {
//        if(parameter >= 10) {
//            int firstDigit = parameter % 10;
//            int secondDigit = ((parameter % 100) - firstDigit) / 10;
//            int thirdDigit = ((parameter % 1000) - (secondDigit + firstDigit)) / 100;
//            return firstDigit + secondDigit + thirdDigit;
//        } else {
//            return -1;
//        }
//    }

    //Solution
    private static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while(number > 0) {
            //extract the least significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least significant digit
            number /= 10;
        }

        return sum;
    }


}
