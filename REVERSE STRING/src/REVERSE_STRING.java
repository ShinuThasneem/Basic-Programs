import java.util.Scanner;

public class REVERSE_STRING {
public static void main(String[] args) {
	
	
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter an input :");
	String originalStr =s.next();
	String reversedStr = "";

	for (int i = 0; i < originalStr.length(); i++) {
	  reversedStr = originalStr.charAt(i) + reversedStr;
	}

	System.out.println("Reversed string: "+ reversedStr);
}
}
