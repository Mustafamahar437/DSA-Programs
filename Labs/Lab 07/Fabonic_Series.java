import java.util.Scanner;

public class Fabonic_Series {
    public void Fabonic(int n){
        int term1=0;
        int term2=1;
        System.out.print(term1+" "+term2+" ");
        for(int i=0;i<n;i++){
            int nexterm=term1+term2;
            if(nexterm<=n)
            System.out.print(nexterm+" ");
            term1=term2;
            term2=nexterm;
        }
    }
    public int Fabonic_Recursion(int n){
        if(n==0||n==1){
            return 1;
        }else {

            return Fabonic_Recursion(n-1)+Fabonic_Recursion(n-2);

        }
    }

    public static void main(String args[]){
        Fabonic_Series ob=new Fabonic_Series();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any number for Fabonic Series :");
        int num=obj.nextInt();
        System.out.println();
        System.out.println("Fabonic Series by Array :");
        long start=System.nanoTime();
        ob.Fabonic(num);
        long End=System.nanoTime();
        long Total=End-start;
        System.out.println();
        System.out.println("Time Take :"+Total);
        System.out.println();
        System.out.println("Fabonic Series by Recursive :");
        long start1=System.nanoTime();
        System.out.println(ob.Fabonic_Recursion(num));
        long End1=System.nanoTime();
        long Total1=End1-start1;
        System.out.println();
        System.out.println("Time Take :"+Total1);

    }
}
