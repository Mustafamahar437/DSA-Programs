import java.util.Scanner;
public class SumNumbers {
    public void Sort(int num[]){
        for(int i=0;i<num.length;i++){
            for (int j=0;j<num.length-1;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }}
        }
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public void Sum(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            int left=i;
            int right =arr.length-1;
            while(left<right){
                int mid=(left+right)/2;
                if(arr[i]+arr[mid]==k){
                    System.out.println("Yes "+arr[i]+" + "+arr[mid]+" = "+k);
                    return;
                }
                else if(arr[i]+arr[mid]<k)
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        System.out.println("No, there are not any two numbers whosw sum is equal to "+k);
    }
    public static void main(String args[]){
        SumNumbers SN=new SumNumbers();
        int num[]={3,8,1,6,2,7};
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Sorted Values :");
        SN.Sort(num);
        System.out.println();
        System.out.println("Enter any Number :");
        n=obj.nextInt();
        SN.Sum(num,n);

    }
}
