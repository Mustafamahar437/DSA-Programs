import java.util.Scanner;

public class Factorial {
    public int Fact(int num){
        int fa=1;
        for (int i=1;i<=num;i++){
            fa=fa*i;
        }
        return fa;
    }
    public int Fact_Recursion(int num){
        if(num==0){
            return 1;
        }else {
            return Fact_Recursion(num-1)*num;
        }
    }


    public static void main(String args[]){
        Factorial Fa=new Factorial();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number for factorial :");
        int num=obj.nextInt();
        System.out.println("Factorial of Array"+num);
        long start=System.nanoTime();
        System.out.println(Fa.Fact(num));
        long End=System.nanoTime();
        long Total=End-start;
        System.out.println();
        System.out.println("Time Take :"+Total);
        System.out.println("Factorial of recursion"+num);
        long start1=System.nanoTime();
        System.out.println(Fa.Fact_Recursion(num));
        long End1=System.nanoTime();
        long Total1=End1-start1;
        System.out.println();
        System.out.println("Time Take :"+Total1);
    }
}
