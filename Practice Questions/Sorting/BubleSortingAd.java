public class BubleSortingAd {
    public static void main(String args[]){
        int arr[]={31,4,1,5,8,3,12,6,98};
        int index=arr.length-1;
        boolean swaped=true;
        while (swaped){
            swaped=false;
            for (int i=0;i<index;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                        swaped=true;
                }
            }
            index--;
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
