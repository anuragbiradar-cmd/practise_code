package interview;

public class EvenLength {
 public static String[] check(String s) {
	 int len=1;
	 String []str=new String[len];
	 String[] split = s.split(" ");
	 int position=0;
	 for(String word:split) {
		 if(word.length()%2==0) {
			 str[position]=word;
			 position++;
			 len++;
		 }
	 }
 
	 
	 return str;
	 
 }
 public static void main(String[] args) {
	 String str="the sky is blue";
  String[] check = check(str);	
  for(String c:check) {
	  System.out.println(c);
  }
}
}
