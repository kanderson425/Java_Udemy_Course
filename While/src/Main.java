public class Main {


    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6) {
//            System.out.printf("Count value is " + count);
//            count++;
//        }

        //For loop
//        for(count = 1; count != 6; count ++) {
//            System.out.println("Count value is " + count);
//        }
//        count = 1;
//        while(true) {
//            if(count==6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        //Do while Expression
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//
//        } while(count != 6);

        int number = 4;
        int count = 0;
        int finishedNumber = 22;
        while (number <= finishedNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if(count >=5) {
                break;
            }
        }
            System.out.printf("Count is " + count);

    }

        //Challenge
        public static boolean isEvenNumber(int number) {
            if((number % 2 == 0)) {
                return true;
            } else {
                return false;
            }
        }

}

