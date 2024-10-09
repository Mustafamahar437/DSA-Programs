import java.util.Random;
import java.util.Scanner;

public class Searching {
    static int count=0;
    public int SearchArray(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("True :");
                return 1;
            }
        }
        System.out.println("Fasle :");
        return 0;
    }

    public int SearchRecursive(int arr[],int n){
        if(count==arr.length){
            return 0;
        }else if(arr[count++]==n){
            System.out.println("Number find on index "+(count-1)+":");
            return 1;
        }else {
            return SearchRecursive(arr,n);
        }
    }
    public static void main(String args[]){
        Searching Se=new Searching();
        int arr[]=new int[10];
        Random rand=new Random();
        Scanner obj=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            int n=rand.nextInt(10);
            arr[i]=n;
        }
        System.out.println("Enter number which one you find :");
        int num=obj.nextInt();
        long start=System.nanoTime();
        System.out.println(Se.SearchArray(arr,num));
        long End=System.nanoTime();
        long Total=End-start;
        System.out.println();
        System.out.println("Time Take :"+Total);
        System.out.println();
        System.out.println("List of Array Element :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter number which one you find Through Recursive :");
        int a=obj.nextInt();
        long start1=System.nanoTime();
        System.out.println(Se.SearchRecursive(arr,a));
        long End1=System.nanoTime();
        long Total1=End1-start1;
        System.out.println();
        System.out.println("Time Take :"+Total1);


    }
}
