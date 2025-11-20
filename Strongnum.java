import java.util.Scanner;

class StrongNUm{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number to check whether its strong number or not:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;

        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
        }
        sum=sum+fact;
              num=num/10;
        }
        if(sum==temp){
            System.out.println(temp+" is a strong number");
        }
        else{
            System.out.println(temp+" is not a strong number");
        }
        
    }
}
