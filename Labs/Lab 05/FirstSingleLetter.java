public class FirstSingleLetter {
    public char firstSingleLetter(char text[],int n){
            for(int i=0;i<text.length-1;i++){
                int count = 0;
                for(int j=0;j<text.length;j++){
                if(text[n] == text[j]){
                    count++;
                    }
                }
                if (count == 1){
                    return text[n];
                }
            }
            return ',';
    }
    public static void main(String args[]){
        FirstSingleLetter FL=new FirstSingleLetter();
       char text[]={'m','u','s','t','a','f','a'};
       int num=2;
        System.out.println(FL.firstSingleLetter(text,num));
    }
}