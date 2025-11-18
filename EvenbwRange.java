import java.util.Scanner;

class Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a starting Number");
        int num1=sc.nextInt();
        System.out.println("Enter a ending Number");
          int num2=sc.nextInt();
          if(num1<=1){
            System.out.println();
          }
          System.out.println("____________________________________");

          System.out.println("The even numbers between " + num1 + " and " + num2 + " are:");

        for(int i = num1; i <= num2; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
          }


    }
}