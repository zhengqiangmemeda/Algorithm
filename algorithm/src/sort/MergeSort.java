/**
 * 
 */
package sort;

/**
 * @author zhengqiang
 *
 */
public class MergeSort {

	/**
	 * @param array the input array that should be sorted
	 * @param low the begin index
	 * @param mid the mid index
	 * @param high the end index
	 */
	public static int[] merge(int[] array,int low,int mid,int high){
		
		int[] mergeArray=new int[high-low+1];//the merge segment	
		int p1=low;//the begin index of the first segment
		int p2=mid+1;////the begin index of the second segment
		int p3=0;////the begin index of the merge segment of the first and the second segment
		
		while(p1<=mid && p2<=high){
			if(array[p1]<=array[p2])
				mergeArray[p3++]=array[p1++];
			else
				mergeArray[p3++]=array[p2++];
		}
		
		while(p1<=mid)
			mergeArray[p3++]=array[p1++];
		
		while(p2<=high)
			mergeArray[p3++]=array[p2++];
		
		for(int i=low,j=0;i<=high;i++,j++){
			array[i]=mergeArray[j];
		}
				
		return array;		
	}
	//非递归实现
	public static void RecursionMergeSort(int[] array,int low,int high){
		//merge the two neighbor sub segment of the same length
		if(low>=high)
			return;
		
		int mid=(low+high)/2;
		
		RecursionMergeSort(array,low,mid);
		RecursionMergeSort(array,mid+1,high);
		merge(array, low, mid, high);
		
	}
	//递归方法
	public static int[] mergeSort(int[] array){
		//merge the two neighbor sub segment of the same length
		int length=array.length;
		int low;
		int mid;
		int high;
		int gap=1;
		while(gap<=length){
			for(int i=0;i+gap<length;i=i+2*gap){
				low=i;
				mid=i+gap-1;
				high=i+2*gap-1;
				if(high>length-1){
					high=length-1;
				}
				merge(array,low,mid,high);
			}
			gap*=2;
		}
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array={3,0,2,1,5,4,7,6,9,8};
		System.out.println();
		//mergeSort(array);
		RecursionMergeSort(array,0,array.length);
		for(int i:array){
			System.out.println(i);
		}
	}

}
