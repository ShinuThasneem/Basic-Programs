
public class SUM_OF_DIGITS {
	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(127));
		
	}
public static int sumOfDigits(int num) {
	if(num==0) {
		return 0;
	}
	else {
		return num%10+sumOfDigits(num/10);
	}
}
}
