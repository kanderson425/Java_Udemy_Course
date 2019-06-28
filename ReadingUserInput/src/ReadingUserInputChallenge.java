import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        //My attempt

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;



            while(count <= 10) {
                System.out.println("Enter number #" + count + ": ");

                boolean hasNextInt = scanner.hasNextInt();
                if(hasNextInt) {
                    int inputNumber = scanner.nextInt();
                    count += 1;
                    sum += inputNumber;
                } else {
                    System.out.println("Invalid Number");
                }

                scanner.nextLine();

            }


        System.out.println("sum = " + sum);

        scanner.close();



        //solution

//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 0;
//        int sum = 0;
//
//
//        while (true) {
//            int order = counter + 1;
//            System.out.println("Enter number #" + order + ": ");
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//
//                if (counter == 10) {
//                    break;
//                }
//
//            } else {
//                System.out.println("Invalid Number");
//
//            }
//
//            scanner.nextLine(); // handle end of line (enter key)
//
//        }
//        System.out.println("sum = " + sum);
//
//        scanner.close();

    }
}
