import java.util.*;
public class DifferentPattern {

	public static void printpatt(String inp,String out) {
		// TODO Auto-generated method stub
		//Base Cases
		if (inp.length()==0) {
			System.out.println(out);
			return ;
		}
		for (int i=1;i<= inp.length();i++) {
		printpatt(inp.substring(i),out+inp.substring(0,i)+"|");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String S= sc.next();
			printpatt(S, "");
	}
	

}
