import java.util.Scanner;
public class Array_2D {

    void NoDup(int arr[][],int ID){
        int arr1[]=new int[ID];
            int num=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
            arr1[num++]=arr[i][j];
            }        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }    }
    public static void main(String args[]){
        Array_2D array=new Array_2D();
        System.out.println("Enter Elements for 2D array");
        Scanner obj=new Scanner(System.in);
        int arr[][]=new int[4][5];
        int num=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("Enter Element "+num+++" :");
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println();
        System.out.println("2D Array");
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("1D Array:");
       array.NoDup(arr,20);
    }
}