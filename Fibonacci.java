import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args){

        int a=0;
        int b=1;
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms to print: ");
        int num=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=2;i<num;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }

}
