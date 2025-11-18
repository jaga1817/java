// 

import java.util.Scanner;
import java.math.BigInteger;

class Factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number which factorial do you want");
        int num=sc.nextInt();

        BigInteger fact = BigInteger.ONE;

        for(int i=num; i>=1; i--){
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println("The factorial of "+num+" is "+fact);
    }
}
