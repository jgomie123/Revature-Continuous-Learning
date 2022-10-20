package algorithms.and.patterns;

/*Merge Sort: 
 * Merge sort uses the divide and conquer strategy for sorting elements. 
 * It recursively breaks down a problem into 21 or more sub problems intil they become simple enough
 * to be solved directly. The solutions to the sub-problems are then combined to give a solution
 * to the original problem. 
 * 
 * The merge sort algorithm looks something like this: 
 * **arr = array that is being sorted
 * **left = first index's position
 * **right = last index's position
 * 
 * //			mergeSort(arr, left, right) {
//
//			    if (left < right) {
//
//			        int mid = [(left + right) / 2];
//			        mergeSort(arr, left, mid); // here we pass in the mid point as the new 
 * 						"last" index position of the left array
//			        mergeSort(arr, mid + 1, right); // (mid + 1) represents the "first" index position of the right array
//
//			        // once the splitting is done, it combines the two completes sorted halves.
//			        merge(arr, left, mid, right);
//			    }   
//			}
 *  
 * */

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {9, 7, 3, 1, 6, 3, 4, 5, 9, 2, 3, 1, 0};
		int[] array1 = {0, -3, -45, 23, 15, 100, 1000, 54, 12, 19, 90, 41};
		sort(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	//parent method
	public static void sort(int[] inputArray) {
		sort(inputArray, 0, inputArray.length - 1);
		//start is first index, end is the last index
	}
	
	public static void sort(int[] inputArray, int start, int end) {
		if(end <= start) {
			return; //we're done traversing the array
		}
		
		int mid = (start + end) / 2; //find the midpoint
		sort(inputArray, start, mid); //sort the left half
		sort(inputArray, mid + 1, end); //sort the right half of array
		merge(inputArray, start, mid, end); //merge sorted results into the inputArray
		
	}
	
	public static void merge(int[] inputArray, int start, int mid, int end) {
		int tempArray[] = new int[end - start + 1];
		
		//index counter for the left side
		int leftSlot = start;
		int rightSlot = mid + 1; //index coutner for the right side
		int k = 0;
		
		while(leftSlot <= mid && rightSlot <=end) {
			if(inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot = leftSlot + 1;
			} else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot = rightSlot + 1;
			}
			k = k + 1;
		}
		
		/*When we get to this point, it mean the above loop has completed so both the right and left sides
		 * of the sub array can be considered sorted
		 * */
		
		if(leftSlot <= mid) {
			while(leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot = leftSlot + 1;
				k = k + 1;
			}
		}else if(rightSlot <= end) {
			while(rightSlot <= end) {
				tempArray[k] = inputArray[rightSlot];
				rightSlot = rightSlot + 1;
				k = k + 1;
			}
		}
		
		
		//System.out.println("Start value: " + start);
		for(int i = 0; i < tempArray.length; i++) {
			inputArray[start + i] = tempArray[i];
		}
		
	}

}
