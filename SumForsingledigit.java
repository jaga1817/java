import java.util.Scanner;

class SumForsingledigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        while(num > 9){            // FIXED: repeat until single digit
            int sum = 0;           // reset sum every time
            int temp = num;

            while(temp > 0){
                int digit = temp % 10;  
                sum = sum + digit;    
                temp = temp / 10;       
            }

            num = sum;  
        }

        System.out.println("The single digit is: " + num);
    }
}
