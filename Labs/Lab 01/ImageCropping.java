import java.sql.SQLOutput;
import java.util.Scanner;
public class ImageCropping {
    void extractBoundries(int arr[][],int num,int num1){
        int a=num-1;
        int b=num1-1;
        for(int i=0;i<num;i++){
            for(int j=0;j<num1;j++){
                if(i==0||i==a){
                    System.out.print(arr[i][j]+" ");
                }
               else if(j==0&&i!=0&&i!=a){
                    System.out.print(arr[i][j]+" ");
                }
               else if(j==b&&i!=0&&i!=a){
                   System.out.print(arr[i][j]+" ");
               }else{
                    System.out.print("  ");
                } }
            System.out.println();
        }  }
    void Centerpart(int arr[][],int num,int num1){
        int a=num-1;
        int b=num1-1;
        for(int i=0;i<num;i++){
            for(int j=0;j<num1;j++){
                if(i==0||i==a){
                    System.out.print("  ");
                }
                else if(j==0&&i!=0&&i!=a){
                    System.out.print("  ");
                }
                else if(j==b&&i!=0&&i!=a){
                    System.out.print("  ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static  void main(String args[]){
        ImageCropping array=new ImageCropping();

        Scanner obj=new Scanner(System.in);
        int num;
        int num1;
        System.out.println("Please Enter the total rows:");
        num= obj.nextInt();
        System.out.println("Please Enter the total Colums");
        num1=obj.nextInt();

        int arr[][]=new int[num][num1];

        for (int i=0;i<num;i++)
        {
            for(int j=0;j<num1;j++){
                System.out.print( "Enter Elements : ["+i+"["+j+"]");
                arr[i][j]=obj.nextInt();
            }
        }

        System.out.println();
        System.out.println("2D Array");
        for (int i=0;i<num;i++)
        {
            for(int j=0;j<num1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("ExtractBoundries:");
        array.extractBoundries(arr,num,num1);
        System.out.println("CenterPart of Matrix:");
        array.Centerpart(arr,num,num1);
    }}
