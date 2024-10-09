import java.util.Scanner;

public class SimpleRecursion {
//static char ch;
    public void number(int num){
        if(num==0){
            System.out.println();
        }else {

            System.out.print(num+" ");
            number(num-1);
            System.out.print(num+" ");
        }
    }

    public void Alphabate(int n){
        if(n>122){
            System.out.println();
        }else {
            char ch;
            int a=n;
            ch=(char)n;
            System.out.print(ch+" ");
            //=(int)ch;
            Alphabate(a+1);
            System.out.print(ch+" ");

        }    }
    public static void main(String args[]){
        SimpleRecursion ob=new SimpleRecursion();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any Number :");
        int num=obj.nextInt();
        ob.number(num);
        System.out.println("Enter ascii Value of  'a' character :");
        int n=obj.nextInt();
        ob.Alphabate(n);
    }
}
