package SomeArrays;

public class SomeArrays {

	public static void main(String[] args) {
		//step6
		int[] firstArr = { 1, 2, 3, 4, 1, 2, 3};
		printArray(firstArr);
		findTuple(firstArr, 5);
		System.out.println("minimum value: " + findMin(firstArr));
		bubbleSort(firstArr);
		printArray(firstArr);
		//step7
		int[] secondArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		printArray(secondArr);
		findTuple(secondArr,12);
		System.out.println("minimum value: " + findMin(secondArr));
		bubbleSort(secondArr);
		printArray(secondArr);
		//step8
		int[] thirdArr = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2};
		printArray(thirdArr);
		bubbleSort(thirdArr);
		printArray(thirdArr);
	}
	
	public static void printArray(int[] arr){
		for(int i=0; i<=arr.length-1; i++){
			System.out.print(arr[i] +  " ");
		}
		System.out.println("");
	}
	
	public static void bubbleSort(int[] arr){
		
		int tmp;
		for(int i=0; i<=arr.length; i++){
			int sorting = 1;
			for(int j=arr.length-1; j>i; j--){
				if(arr[j-1]>arr[j]){
					sorting=0;
					tmp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tmp;
				}
			}
			if(sorting==1)
				break;
		}
		
	}
	
	public static int findMin(int[] arr){		
		int minimum=arr[0];
		for(int i=0; i<=arr.length-1; i++){
				if(arr[i]<minimum){
					minimum=arr[i];
				}
		}
		return minimum;
	}

	public static void findTuple(int[] arr, int targetNum){
		for(int i=0; i<=arr.length-2; i++){
			for(int j=i+1; j<=arr.length-1; j++){
				if(arr[i]+ arr[j]==targetNum)
					System.out.println("Tuple Numbers: " + arr[i] + ", " + arr[j]);
			}
		}	
	}

}
