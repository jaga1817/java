import java.util.Scanner;

class SwitchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you have");
        int money = sc.nextInt();

        if(money < 0){
            System.out.println("Invalid amount");
        }
        else if(money < 100){
            System.out.println("There is nothing to show you in this price");
        }
        else if(money < 300){
            System.out.println("You can have some drink");
        }
        else if(money < 700){
            System.out.println("You can have some biryani");
        }
        else if(money < 1000){
            System.out.println("You can have biryani + drink");
        }
        else {
            System.out.println("You can have biryani + drink + a movie ticket");
        }
    }
}
