package array;

public class syntax {
	public static void main(String[] args) {
		int [] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[3]=30;
		arr[4]=40;
		arr[5]=50;
		for(int i=0;i<=arr.length;i++) {
			System.out.println("Element at index"+i+"is"+arr[i]);
		}
	}

}
