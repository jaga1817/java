import java.util.Scanner;
class Amount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount=sc.nextInt();
        if(amount<100)
        System.out.println("invaid amount,only 2000,500,200,100 are available.");
    if(amount>=2000){
    int a2000=amount/2000;
    System.out.println("2000*"+a2000+"="+(2000*a2000));
    amount=amount%2000;
    }
     if (amount>=500){
    int a500=amount/500;
     System.out.println("500*"+a500+"="+(500*a500));
     amount=amount%500;
    }
     if(amount>=200){
     int a200=amount/200;
     System.out.println("200*"+a200+"="+(200*a200));
     amount=amount%200;
    }
    if (amount>=100){
     int a100=amount/100;
      System.out.println("100*"+a100+"="+(100*a100));
    }
      System.out.println();

    }
}