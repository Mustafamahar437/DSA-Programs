public class Task_Two {
Node head;
Node tail;
int num=0;
void AddElement(int data){
    Node node=new Node(data);
    if(head==null){
        head=tail=node;
    }else{
        tail.next=node;
        tail=node;
    }
}
void Print(){
    if(head==null)
        System.out.println("Linklist is empty");
    else {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"  ");
            num++;
            temp=temp.next;
        }
    }
    System.out.println();
}

public static void main(String arg[]){
    Task_Two task=new Task_Two();
    task.AddElement(5);
    task.AddElement(12);
    task.AddElement(15);
    task.AddElement(30);
    task.AddElement(25);
    task.Print();
    System.out.println();
    System.out.println("Total length is :"+task.num);

}
}
