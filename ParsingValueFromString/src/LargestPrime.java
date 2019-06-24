public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));

    }

    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }
        int maxPrime = 0;
        while (number % 2 == 0) {
            maxPrime = 2;
            number /= 2 ;
        }
        for(int i = 3; i <= number; i +=2) {
            while(number % i == 0) {
                maxPrime = i;
                number = number / i;
            }
        }
//        if(number > 2) {
//            maxPrime = number;
//        }
        return maxPrime;
    }
}
