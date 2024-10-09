public class InsertionSorting {
    public static void main(String args[]){
        int arr[]={1,3,5,2,73,4,56,6};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
