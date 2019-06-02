public class calcFeetAndInchesToCentimeters {

    public static void main(String[] args) {
        double totalInches = calcFeetAndInchesToCentimeters(5, 8);
        System.out.print("The total number of inches is " + totalInches);
        calcFeetAndInchesToCentimeters(60);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if( feet >= 0 && (inches >= 0 && inches <= 12)) {
            System.out.println(feet + " feet and " + inches + " inches");
            double totalInches = (feet * 12) + inches;
            return totalInches;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            double feet = inches / 12;
            double centimeters = inches * 2.54;
            System.out.println(inches + " inches is equivalent to " + feet + " feet");
            System.out.println(inches + " inches is equivalent to " + centimeters + " centimeters");
            return feet;
        } else {
            return -1;
        }
    }

}
