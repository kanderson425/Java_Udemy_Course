public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(900);

    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        if(number == 0) {
            System.out.println("Zero");
        }
        int newNumber = reverse(number);
        int digitDifference = getDigitCount(number) - getDigitCount(newNumber);
        while(newNumber > 0) {
            int digit = newNumber % 10;
            if(digit == 0) {
                System.out.println("Zero");
            }
            if(digit == 1) {
                System.out.println("One");
            }
            if(digit == 2) {
                System.out.println("Two");
            }
            if(digit == 3) {
                System.out.println("Three");
            }
            if(digit ==4) {
                System.out.println("Four");
            }
            if(digit == 5) {
                System.out.println("Five");
            }
            if(digit == 6) {
                System.out.println("Six");
            }
            if(digit == 7) {
                System.out.println("Seven");
            }
            if(digit == 8) {
                System.out.println("Eight");
            }
            if(digit == 9) {
                System.out.println("Nine");
            }
            newNumber /= 10;
        }
        for(int i = 0; i < digitDifference; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0) {
            reverse = reverse * 10;
            reverse = reverse + (number % 10);
            number = number / 10;
        }
        return reverse;
    }
//
    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int sum = 0;
        while(number > 0) {
            number /= 10;
            sum += 1;

        }
        return sum;
    }


}
