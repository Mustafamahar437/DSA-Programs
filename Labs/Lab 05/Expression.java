import java.util.Stack;
public class Expression {
    static String text="";
    static String text1="";
    static char b;
    public int prec(char c){
            if(c=='*'||c=='/')
            return 1;
            else if (c=='+'||c=='*')
            return 2;
            else
                return -1;
    }
    public void Postfix(char ch[]){
        Expression Ex=new Expression();
        Stack<Character> S=new Stack<>();
         for (int i=0;i<ch.length;i++) {
            // char c= (char) S.peek();
             int a=Ex.prec(ch[i]);
             int c=Ex.prec(b);
             if (ch[i] >= 'A' && ch[i] <= 'Z'){
                 text = text + ch[i];
             }
             else if (S.isEmpty()||a > c) {
                 S.push(ch[i]);
                 b=ch[i];
             }else {
                 text=text+ch[i]+S.pop();
                }
         }
         while (!S.isEmpty()){
             text=text+S.pop();
         }
        System.out.println(text);
     }
    public static void main(String args[]){
        Expression E=new Expression();
        char ch[]={'A','+','B','*','C','+','D'};
        E.Postfix(ch);
        System.out.println();
        System.out.println();
        
    }
}
