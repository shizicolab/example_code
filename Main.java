import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter x number");
        float x = myScan.nextFloat();
        System.out.println("Please enter y number");
        float y = myScan.nextFloat();
        System.out.println("Please enter z number");
        float z = myScan.nextFloat();

        int count = 0;        // variable of the amount of times that the numbers that the usrt inserts is positive
        if (x > 0) {
            System.out.println("x is: " + x);
            count++; //add count number

            if( y> 0 ) {
                System.out.println("y is: " + y);
                count++;
            }
            if(z >0 ) {
                System.out.println("z is: " + z);
                count++;
            }
            System.out.println("count the number of times that the numbers are positive : " + count);
        }









//        Scanner myScan = new Scanner(System.in);
//        System.out.println("Please enter a number");
//        int a = myScan.nextInt();
//        System.out.println("Please enter b number");
//        int b = myScan.nextInt();
//        System.out.println("Please enter c number");
//        int c = myScan.nextInt();
//
//        if (a!=b && b!=c && a!=c) {
//            System.out.println("diff");
//        } else {
//            System.out.println("similar");
//        }
//



//        if ( a != b && a != c && b != c) {
//            System.out.println("diff");
//        }
//        else {
//            System.out.println("similar");
//        }










//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter number for a");
//        double a = scan.nextDouble();
//        System.out.println("Please enter number for b");
//        double b = scan.nextDouble();
//
//        if ( a > b ) {
//            System.out.println("a is bigger" + " " + a);
//        }
//        if ( a < b ) {
//            System.out.println("b is bigger" + " " + b);
//        }














       //Math hw solution  (shkufit 35)
//        System.out.println(Math.pow( 5, 3)); //5*5*5 = 125  //question number 1
//        System.out.println(Math.max(7 ,8.99)); //8.99       //question number 2
//        double number = 5.7;                                //question number 3
//        System.out.println(Math.ceil(number)); //6
//        System.out.println(Math.floor(number)); //5
//        System.out.println(Math.round(number)); //6
//        System.out.println(Math.sqrt(225)); //15            //question number 4
//
//
//        Scanner scan = new Scanner(System.in);              //question number 5
//        System.out.println("Please enter side a");
//        int a = scan.nextInt();
//        System.out.println("Please enter side b");
//        int b = scan.nextInt();
//        System.out.println("Please enter side c");
//        int c = scan.nextInt();
//        System.out.println("The perimeter of the triangle is: " + (a + b + c));
//
////        // part1 hw solution
//        Scanner Myscan = new Scanner(System.in);
//        System.out.println("Please enter temperature");
//
//        float temperature = Myscan.nextFloat();
//        if ( temperature > 36.5 ) {
//            System.out.println("Hot");
//        }
//        if ( temperature < 36.5 ) {
//            System.out.println("Cold");
//        }
//


        //part2 hw solution
        //1
//        solve later
        // 2
//        Scanner myScan = new Scanner(System.in);
//        System.out.println("Please enter a number");
//        int a = myScan.nextInt();
//        System.out.println("Please enter b number");
//        int b = myScan.nextInt();
//        System.out.println("Please enter c number");
//        int c = myScan.nextInt();
//
//        if ( a != b && a != c && b != c) {
//            System.out.println("diff");
//        }
//        else {
//            System.out.println("similar");
//        }
    }
}