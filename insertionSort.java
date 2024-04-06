import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {9, 2, -1, 6, 1, 0, 8, 3, 5};
		
		System.out.println(" Given Array: " + Arrays.toString(nums));
		
		
		System.out.println();
		System.out.println("1. Sorted Array: " + Arrays.toString(insertionSort(nums)));
		System.out.println("2. Sorted Array: " + Arrays.toString(insertionSort2(nums)));
		
	}
	
	private static int[] insertionSort2(int[] a){
	    for(int i=1; i<a.length; i++){
	        int min = a[i];
	        int j = i - 1;
	        for(; j>= 0 && a[j] >= min; j--)
	            a[j+1] = a[j];
	        
	        a[j+1] = min;
	    }
	    
	    return a;
	}
	private static int[] insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            int key = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }
}