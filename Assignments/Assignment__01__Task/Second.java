public class Second {
    Node head;
    static int num=0;
    void Add(int data){
        Node newNOde=new Node(data);
        newNOde.next=head;
        head=newNOde;
            }
    void Print() {
        if (head==null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                num++;
                temp = temp.next;
            }
        }}
        void PrintSort () {
            int array[]=new int[num];
            if (head == null){
                System.out.println("Linked list is empty");
            } else {
                int m=0;
                Node temp = head;
                while (temp != null) {
                    array[m++]= temp.data;
                    temp = temp.next;
                }
                for(int k=0;k<array.length;k++){
                    for(int l=0;l<array.length-1;l++){
                        if(array[l]>array[l+1]){
                            int temp2=array[l];
                                array[l]=array[l+1];
                                array[l+1]=temp2;
                        }
                    }
                }
                Node temp2=head;
                for(int i=0;i<array.length;i++){
                    temp2.data=array[i];
                    temp2=temp2.next;
                }
                Node temp3=head;
                while(temp3!=null){
                    System.out.print(temp3.data+" ");
                    temp3=temp3.next;
                }
            }
        }
        public static void main (String args[]){
            Second S1 = new Second();
            S1.Add(2);
            S1.Add(3);
            S1.Add(6);
            S1.Add(10);
            System.out.println("Befor Sorting values :");
            S1.Print();
            System.out.println();
            System.out.println("After Sorting Values :");
            S1.PrintSort();
        }
    }
