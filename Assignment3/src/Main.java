import java.util.*;

public class Main {
	
	public static boolean hasSum(int Arr[], int target) {
		int left, right; //Pointers
		
		int arr_size = Arr.length; //Storing the length of the array
		
		Arrays.sort(Arr); //Sorting the array
		
		System.out.println("Input Array: " + Arrays.toString(Arr));

		
		left = 0; //Left Pointer Starts from beginning of array
		right = arr_size - 1; //Right Pointer starts from the end of the array
		
		while(left < right) {
			if (Arr[left] + Arr[right] == target) {
				System.out.println(Arr[left] + "+" + Arr[right] + "=" + target);
				return true;
			} else if (Arr[left]+Arr[right] < target) {
				left++;
			} else //Arr[left]+Arr[right] 
				right--;
		}
		return false;
	}
	
public static void main(String args[]) {
		int A[] = { 1, 4, 45, 6, 10, -8 };
		int target = 16;
		
		int B[] = { 2,-2, 4, 5};
		int b_target = 6;
		
		int C[] = {3, 6, 9, 12};
		int c_target = 18;
		
		int D[] = {1, 3, 5, 7, 9};
		int d_target = 5;
		
		
		int E[] = {10,50,100,12,-1};
		int e_target = 11;
		
		if (hasSum(A, target)) {
			System.out.println("Array has the elements");
			System.out.println("------------------");
		} else {
			System.out.println("No elements make up the target");
			System.out.println("------------------");
			}
		
		if (hasSum(B, b_target)) {
			System.out.println("Array has the elements");
			System.out.println("------------------");
		} else {
			System.out.println("No elements make up the target");
			System.out.println("------------------");
		}
		
		if (hasSum(C, c_target)) {
			System.out.println("Array has the elements");
			System.out.println("------------------");
		} else {
			System.out.println("No elements make up the target");
			System.out.println("------------------");
		}
		
		if (hasSum(D, d_target)) {
			System.out.println("Array has the elements");
			System.out.println("------------------");
		} else {
			System.out.println("No elements make up the target");
			System.out.println("------------------");
		}
		
		if (hasSum(E, e_target)) {
			System.out.println("Array has the elements");
			System.out.println("------------------");
		} else {
			System.out.println("No elements make up the target");
			System.out.println("------------------");
		}
	}
}