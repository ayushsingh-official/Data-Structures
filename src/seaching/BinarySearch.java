package seaching;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		
		// Array has to be Sorted .
		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		int ans = 60 ;
		
		int leftIndex =0 ;
		int rightIndex = arr.length -1;
		
		
		// Important  
		// Logic 
		while(leftIndex <= rightIndex) {
			
			int mid = (rightIndex + rightIndex ) / 2 ;
			
			if(ans < arr[mid]) {
				rightIndex = mid -1;
			}else if(ans > arr[mid]) {
				leftIndex = mid +1;
			}else {
				System.out.println(mid);
				return;
			}
			
		}
		
		//if code comes outside loop means no value present in Array
		System.out.println(-1);
		
	}
	
}
