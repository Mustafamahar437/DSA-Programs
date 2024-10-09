import java.util.Scanner;
public class Array_arrange {
    public static void main(String args[]){
        int num[]= new int[10];
        Scanner obj=new Scanner(System.in);
        System.out.println("Please enter any ten Numbers");
        for(int i=0;i<num.length;i++){
            num[i]=obj.nextInt();
                    }
        System.out.println();
        int temp=0;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length-1;j++){
                if(num[j]%2==0){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
