import java.util.Scanner;

class Automorphic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Automorphic: ");
        int num=sc.nextInt();

        int square=num*num;
        if(num<10){
            int Automorphic=square%10;
            if(Automorphic==num)
                System.out.println(num+" is an Automorphic number.");
                else
                System.out.println(num+" is not an Automorphic number.");
        }
        else if(num<100){
            int Automorphic=square%100;
            if(Automorphic==num)
                System.out.println(num+" is an Automorphic number.");
                else
                System.out.println(num+" is not an Automorphic number.");
        }
        else if(num<1000){
            int Automorphic=square%1000;
            if(Automorphic==num)
                System.out.println(num+" is an Automorphic number.");
                else
                System.out.println(num+" is not an Automorphic number.");
        }
        else{
            System.out.println("Number is too large to check.");
        }
       
    }
}