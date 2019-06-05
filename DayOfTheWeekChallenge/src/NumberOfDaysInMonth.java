public class NumberOfDaysInMonth {


    public static void main(String[] args) {
        getDaysInMonth(-1, 2020);
    }

    //Attempt
//    public static boolean isLeapYear(int year) {
//        if(year < 1 || year > 9999) {
//            System.out.printf("False");
//            return false;
//        } else if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
//            System.out.println("True");
//            return true;
//        } else {
//            System.out.println("False");
//            return false;
//        }
//    }
//
//    public static int getDaysInMonth(int month, int year) {
//        if(year < 1 || year > 9999 || month < 1 || month > 12) {
//            return -1;
//        } else {
//            switch (month) {
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12:
//                    return 31;
//                    break;
//
//                case 4:
//                case 6:
//                case 9:
//                case 11:
//                    return 30;
//                    break;
//
//                case 2:
//                    if (isLeapYear(year) == true) {
//                        System.out.println("29");
//                        return 29;
//                    } else {
//                        System.out.println("28");
//                        return 28;
//                    }
//                    break;
//
//                default:
//                    System.out.println("-1");
//                    return -1;
//                    break;
//            }
//        }
//    }

    //Solution
    public static boolean isLeapYear( int year)
    {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public static int getDaysInMonth ( int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("-1");
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 days");
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30days");
                    return 30;
                case 2: {
                    if (isLeapYear(year) == true) {
                        System.out.println("29days");
                        return 29;
                    } else {
                        System.out.println("28days");
                        return 28;
                    }
                }
                default:
                    return -1;
            }
        }
    }
    }
