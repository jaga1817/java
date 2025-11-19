import java.util.Scanner;

class SumOfEven{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int n=sc.nextInt();
        System.out.println("Enter the ending number:");
        int m=sc.nextInt();
        int sum=0;

        if(n>m && n<1){
            System.out.println("Invalid input");
            return;
        }

        for (int i=n;i<=m;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("The sum of even numbers between "+n+" and "+m+" is: "+sum);

    }

}