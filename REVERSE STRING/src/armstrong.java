
public class armstrong {
public static void main(String[] args) {
	int num=1634;
	int sum=0;
	int backUp=num;
	while(num>0) {
		sum=sum+(num%10)*(num%10)*(num%10);
		num=num/10;
	}
	if(sum==backUp) {
		System.out.println("the number is armstrong");
	}
	else {
		System.out.println("its not armstrong");
	}
}
}
