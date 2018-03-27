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
    public void quickSort(int[]a, int left, int right){   
        if(left<right){
            int low=left;
            int high=right;
            int pivot=a[low];
        	while(low<high){
        		while(low<high && a[high]>pivot){
                    high--;
                }
                a[low]=a[high];
                while(low<high && a[low]<=pivot){
                	low++;
                }
                a[high]=a[low];
            }
            a[low]=pivot;
            quickSort(a,left,low-1);
            quickSort(a,low+1,right); 
        }
    }
	
	public static void main(String[] args) {
		QuickSort q=new QuickSort();
		// TODO Auto-generated method stub
		//int [] array={3,0,2,1,5,4,7,6,9,8};
		int[] array={2,1,2,4,3,4};
		System.out.println("start: "+System.currentTimeMillis());
		//mergeSort(array);
		q.quickSort(array,0,array.length-1);
		System.out.println("e n d: "+System.currentTimeMillis());
		for(int i:array){
			System.out.println(i);
		}
	}

}
