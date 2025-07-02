
import java.util.Arrays;
public class BubbleSortAlgo {
public static void main(String[] args) {
	int[] arr= {5,3,1,2,4};
	System.out.println(Arrays.toString(arr));
	sortAsendingOrder(arr);
	System.out.println(Arrays.toString(arr));
	sortDecendingOrder(arr);
	System.out.println(Arrays.toString(arr));
}

private static void sortAsendingOrder(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}System.out.println(Arrays.toString(arr));
		}
	}
	
}

private static void sortDecendingOrder(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
} 
}
