import java.util.Scanner;

class PrimeInARange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number of the range:");
        int Start=sc.nextInt();
        System.out.println("Enter the Ending number of the range:");
        int End=sc.nextInt();
        System.out.println("Prime numbers between "+Start+" and "+End+" are:");

        for(int i=Start;i<=End;i++){
                if(i<2) continue;
                boolean Flag=true;

            for(int j = 2; j * j <= i; j++){
                    if(i%j==0){
                        Flag=false;
                        break;
                    }

                }
                if(Flag){
                    System.out.print(i+" ");
                
            }
        
}
    }}