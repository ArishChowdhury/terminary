import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;

        int largestNumber;
        Scanner ss = new Scanner(System.in);
        System.out.println("Entering same number twice or thrice in the same execution may cause miscalculation");
      System.out.println("Please enter the first number");
        n1 = ss.nextInt();

        System.out.println("Please enter the second number");
        n2 = ss.nextInt();

        System.out.println("Please enter the third number");
        n3 = ss.nextInt();


        largestNumber = ((n1>n2) && (n1>n3))?n1: ((n2>n3) && (n2>n1))?n2: n3;

        System.out.println(largestNumber+" is the largest number");


//        Scanner ss = new Scanner(System.in);
//        System.out.println("Please enter the first number");
//        n1 = ss.nextInt();
//
//        System.out.println("Please enter the second number");
//        n2 = ss.nextInt();
//
//        System.out.println("Please enter the third number");
//        n3 = ss.nextInt();
//
//        if(n1>n2 && n1>n3){
//            System.out.println(n1+" is the biggest number");
//        }
//
//        else if(n2>n1 && n2>n3){
//            System.out.println(n2+" is the biggest number");
//        }
//
//        else if(n3>n1 && n3>n2){
//            System.out.println(n3+" is the biggest number");
//        }
//
//        else{
//            System.out.println("INVALID");
//        }


        }
    }
