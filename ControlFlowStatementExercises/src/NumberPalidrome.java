public class NumberPalidrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int newNumber = number;
        if(number < 0) {
            number = number * -1;
        }
        while (number > 0) {
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
            if(newNumber == (reverse * -1) || newNumber == reverse) {
                return true;
            }

        }
        return false;
    }

}
