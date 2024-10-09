public class Insertion_Sort {
    public void Insertion(int num[]){
        for(int i=0;i<num.length;i++){
            int temp=num[i];
            int j=i-1;
            while (j>=0&&num[j]>temp){
                num[j+1]=num[j];
                j=j-1;
            }
            num[j+1]=temp;
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public void Selection(int num[]){
        int mid;
        for(int i=0;i<num.length-1;i++){
            mid=i;
            for(int j=i+1;j<num.length;j++){
                if(num[mid]>num[j]){
                 mid=j;
                }
            }
            int temp=num[mid];
            num[mid]=num[i];
            num[i]=temp;
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }    }
public static void main(String args[]){
        Insertion_Sort IS=new Insertion_Sort();
    int value[]={2,5,7,0,4,3,1,13};
    System.out.println("Insertion Sorting :");
    IS.Insertion(value);
    System.out.println();
    System.out.println("Selection Sorting :");
    IS.Selection(value);
        }
}