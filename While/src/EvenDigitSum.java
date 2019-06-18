public class EvenDigitSum {

    public static void main(String[] args) {
        getEvenDigitSum(123456789);

    }


    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            System.out.println("-1");
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /=10;
        }
        System.out.println(sum);
        return sum;
    }
}
