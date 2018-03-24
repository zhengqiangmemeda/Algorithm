/**
 * 
 */
package sort;

/**
 * @author zhengqiang
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void quickSort(int[] array,int low,int high){
		if(low<high){
			int pivot=array[low];
			int i=low;
			int j=high;
			while(i<j){
				
				while(i<j && array[j]>pivot){
					j--;
				}
				if(i<j){
					array[i]=array[j];
				}
				
				while(i<j && array[i]<=pivot){
					i++;
				}
				if(i<j){
					array[j]=array[i];
				}
				//
			}
		array[i]=pivot;
		quickSort(array,low,i-1);
		quickSort(array,i+1,high);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array={3,0,2,1,5,4,7,6,9,8};
		System.out.println("start: "+System.currentTimeMillis());
		//mergeSort(array);
		quickSort(array,0,array.length-1);
		System.out.println("e n d: "+System.currentTimeMillis());
		for(int i:array){
			System.out.println(i);
		}
	}

}
