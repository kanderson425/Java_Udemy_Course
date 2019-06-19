public class PerfectNumber {


    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
//                System.out.println(i);
                sum += i;

            }
            if(sum == num) {
                return true;
            }
        }
        return false;
    }

}
