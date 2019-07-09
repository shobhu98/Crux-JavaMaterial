package lecture_5;

public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("a");
        System.out.println("start");
        for (int i = 0; i <1000000 ; i++) {
            a.append("a");

        }
        System.out.println(a);
        System.out.println("stop");
     //   System.out.println(toggle("AstuW"));


    }
    public static  String toggle(String line){
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char ch=line.charAt(i);
            //process ch
            if(ch>='a'&&ch<='z'){
                ch=(char)('A'+ch-'a');
            }
            else if(ch>='A'){
                ch=(char)('a'+ch-'A');
            }
            //append  to buillder
            builder.append(ch);

        }


        return builder.toString();
    }
    public  static  void oddEven(StringBuilder line){
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(i%2==0){

                ch=(char)(ch-1);

                }
            else{
                ch=(char)(ch+1);
            }
            builder.append(ch);
        }

    }
}
