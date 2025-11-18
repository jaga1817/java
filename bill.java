import java.util.Scanner;
class Units{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units");
        int units=sc.nextInt();
        if(units<=250){

              System.out.print(units+" units:"+units*3);
        }
         else if(units<=300){
            int k=units-250;
              System.out.println("250 units:"+250*3);
            System.out.println(units+"units :"+(250*3+k*5));
        }
        else {
            int j=units-300;
            System.out.println("250 units:"+250*3);
            System.out.println("300 units:"+(50*5+250*3));
            System.out.println( units+"units :"+(250*3+50*5+j*7));
        }
    }
}

