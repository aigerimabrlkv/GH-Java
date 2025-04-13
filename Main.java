import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        /* System.out.println("Hello world!");
        int number = 10;
        double pi = 3.14;
        char a = 'a';
        boolean right = false;
        String s = "hello";
        String b = s + " world.";
        System.out.println(b);
        int a = 11;
        int b = 5;
        int c = a % b;
        System.out.println(c);
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+ name);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println(d);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("negative");
        } else {
            if (n > 0) {
                System.out.println("positive");
            } else {
                System.out.println("Zero");
            }
        }
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("a")){
            System.out.println("A");
        }else{
            if(s.equals("b")){
                System.out.println("B");
            }else{
                if(s.equals("c"){
                    System.out.println("C");
                }else{
                    System.out.println("Invalid character");
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int dayNumber= sc.nextInt();
        switch(dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day number");
        }*/

        //arrays

//        int[] array = new int[]{10, 20, 30};
//        System.out.println(array[0]);

        //increment

//        int i =100;
////        i=i+1;
////        i += 1;
////        i ++;
////        ++i;
//
//        System.out.println(i);

        //loops: for, while, do while
//        int[] array = new int[]{1, 3, 2, 4, 5, 7, 9}
//        for( int i= 0; i < array.length; i++){
//            System.out.println(i);
//        }
//        String[] months = new String[]{
//                "January",
//                "February",
//                "March",
//                "April",
//                "May",
//                "June",
//                "July",
//                "August",
//                "September",
//                "October",
//                "November",
//                "December"
//        };
        //for (int i=months.length-1; i>=0; i--){
        //    System.out.println(months[i]);
        //}
        //for (int i=0; i<months.length; i++){
                //System.out.println(months[i]);
            //}

        //while loop
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//
//        //do=while loop
//        int i = 0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<5);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; ++j) {
//                System.out.print('*');
//            }
//            System.out.println("");
//        }*/
//        int i=0 ;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<5);

//                String[] months = new String[]{
//                "January",
//                "February",
//                "March",
//                "April",
//                "May",
//                "June",
//                "July",
//                "August",
//                "September",
//                "October",
//                "November",
//                "December"
//        };
//        int i=0;
//        do {
//            System.out.println(months[i]);
//            i++;
//        } while (i<months.length);

        Random rand= new Random();
        int number= Math.abs(rand.nextInt()) % 100;
        System.out.println(number);
        Scanner sc = new Scanner(System.in);
        int guess =sc.nextInt();

        if(number == guess){
            System.out.println("You Win!");
        } else{
            if(number > guess){
                System.out.println("less!");
            }else{
                System.out.println("greater!");
            }
        }


    }
}