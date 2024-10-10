public class Quick_Sort {
    public int Quick(int arr[], int low, int high){
        int P=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if (arr[j] <P) {
                i++;
                int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public void Sort(int arr[],int low,int high){
        if(low<high) {
            int p = Quick(arr, low, high);
            Sort(arr, low, p - 1);
            Sort(arr, p + 1, high);
        }
    }
    public static void mergeSort(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<n1&&j<n2){
            if(L[i]<R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }

    public  void Split(int arr[],int left,int right){
        if(left<right){
            int mid=(right+left)/2;
            Split(arr, left, mid);
            Split(arr, mid+1, right);
            mergeSort(arr,left,mid,right);
        }}

    public static void main(String args[]){
        Quick_Sort QS=new Quick_Sort();
        int arr[]={25,20,11,30,12,18,2,28};
        int array[]={5,0,1,3,12,18,200,8};

        System.out.println("Befor Sorting Elements array one:");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Befor Sorting Elements array two:");
        for(int i=0;i<arr.length;i++){

            System.out.print(array[i]+" ");
        }
        int a= arr.length-1;
        QS.Sort(arr,0,a);
        System.out.println();
        System.out.println();
        System.out.println("After Quick Sorting Elements of array one:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        QS.Split(array, 0, arr.length - 1);
        System.out.println("After Marge Sorting Elements of Array two:");
        for (int i=0;i<arr.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
