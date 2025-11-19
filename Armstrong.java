import java.util.Scanner;

class ArmStronNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int num=sc.nextInt();
        int temp = num;
        int count=0;

        while(num>0){
            count++;
            num=num/10;
        }
        num=temp;
        int sum=0;
        while(num>0){
            int digit=num%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power=power*digit;
            }
            sum=sum+power;
            num=num/10;
        }
        if(sum==temp){
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }

    }
}