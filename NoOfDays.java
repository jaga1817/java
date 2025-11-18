import java.util.Scanner;
class Practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        System.out.println("Enter the month you want");
        int month=sc.nextInt();
        int Noofdays=0;
        if(month>12){
            System.out.println("invalid month");
        }

        if(month==2){

        if(year%4==0 && year%100!=0 || year%400==0){
                Noofdays=29;
            }else if{
                Noofdays=28;
            }
        }
        }else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            Noofdays=31;
        }else if(month==4||month==6||month==9||month==11){
            Noofdays=30;
        }else if(month==2){
            Noofdays=28;
        }
        System.out.println("_________________________");

        for( int i=1;i<=Noofdays;i++){
            System.out.print(i+" ");
        }

            

    }
}