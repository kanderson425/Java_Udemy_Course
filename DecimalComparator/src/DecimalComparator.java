public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if(Math.signum(num1) != Math.signum(num2)) {
            return false;
        } else if (Math.floor(Math.abs(num1) * 1000) == Math.floor(Math.abs(num2) * 1000)) {
            System.out.printf(Math.floor(num1 * 1000) + "    " + Math.floor(num2 * 1000));
            System.out.println("True");
            return true;
        }
        System.out.printf(Math.floor(num1 * 1000) + "    " + Math.floor(num2 * 1000));
        System.out.println("False");
        return false;
    }
}
