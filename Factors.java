import java.util.Scanner;

class Factors{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its factors:");
        int num=sc.nextInt();
        System.out.println("Factors of " + num + " are:" );

        if(num<0){
            num= Math.abs(num);
        }

        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println( i);
            }
        }
    }
}