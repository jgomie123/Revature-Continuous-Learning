package algorithms.and.patterns;

/*Recursion: recursion is when a method calls itself
 * for example: 
 * public static void foo(){
 * 		foo();
 * }
 * 
 * The above method will continue to call itself over and over
 * and adding one frame on top of another in the stack until we get a StackOverflowError.
 * WHen it comes to leveraging recursion in our code, we do need to add a condition for the method
 * to be invoked - this condition is called a "Base Case."
 * */

public class RecursiveSearchingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reduceByOne(10);
		/*Why does the console print 10 last and -1 first? 
		 * The last method on topd of the stack is the condition that breaks the recursive loop
		 * When that method completed, it allows the previous method (where a = 0) to be completed and  
		 * released from the stack. THis process continues all the way until the first is popped 
		 * off the stack (a = 10)
		 * */
		
		int[] array = {4, 10, 15, 23, 24, 30, 35, 100, 1000, 3000, 3500, 4000};
		//System.out.println(recursiveLinearSearch(array, 0, 35));
		System.out.println(recursiveBinarySearch(array, 0, 11, 100));
		
		
	}
	
	public static void reduceByOne(int a) {
		if (a >= 0) {
			reduceByOne(a - 1);
		}
		System.out.println("Completed call: " + a);
	}
	
	public static int recursiveLinearSearch(int[] array, int i, int x) {
		//x will be the number I am looking for
		if(i > array.length - 1) {
			return -1;
		} else if(array[i] == x) {
			return i;
		} else {
			System.out.println("Index at: " + i); //this shows how many times it was invoked
			return recursiveLinearSearch(array, i + 1, x); //instead of using a for loop we will increment by 1 here
		}
		
	}
	
	public static int recursiveBinarySearch(int[] array, int min, int max, int x) {
		System.out.println("[ " + min + " ... " + max + " ]");
		
		if(min > max) {
			return -1; 
		} else {
			int mid = (min + max) / 2;
			if(array[mid] == x) {
				return mid; //if my number is here, return the mid index
			} else if(array[mid] > x) {
				return recursiveBinarySearch(array, min, mid - 1, x);
			} else {
				return recursiveBinarySearch(array, mid + 1, max, x);
			}
		}
	}

}
