package interview;

public class RemoveDuplicates {
public static void main(String[] args) {
	String s="abcadb";
	   String s1="";
	   int position=0;
	   int count=0;
	   while(position<s.length()) {
	   if(s1.length()==0) {
		   s1+=s.charAt(position);
		   position++;
	   }else {
		   for(int i=0;i<s1.length();i++) {
			   if(s.charAt(position)==s1.charAt(i)) {
				   count++;
			   }
		   }
		   if(count==0) {
			   s1+=s.charAt(position);
			   position++;
		   }else {
			   count=0;
			   position++;
	   }
	   }
	   }
	   
	   System.out.println(s1);
	   }


}
