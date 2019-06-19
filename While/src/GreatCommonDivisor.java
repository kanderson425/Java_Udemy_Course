public class GreatCommonDivisor {


    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if(num1 < 10 || num2 < 10) {
            return -1;
        }

        int minimum = Math.min(num1, num2);

        for(int i = minimum; i > 1; i--) {
            if((num1 % i == 0) && (num2 % i) == 0) {
              return i;
            }
        }
        return 1;
    }
}
