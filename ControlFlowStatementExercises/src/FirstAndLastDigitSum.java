public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(299));

    }

    public static int sumFirstAndLastDigit(int number) {
        if( number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        int rev = 0;
        while(number > 0) {
            int r = number % 10;
            rev = (rev * 10) + r;
            number = number /10;
        }

        int firstDigit = rev % 10;
        int sum = firstDigit + lastDigit;

        return sum;
        }


}

