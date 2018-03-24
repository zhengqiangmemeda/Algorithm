/**
 * 
 */
package sort;

/**
 * @author zhengqiang
 *
 */
public class ShellSort {

	/**
	 * @param args
	 */
	public void shellSort(int[] array){
		
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
	        // do the insertion sort
	        for (int i = gap; i < array.length; i++) {
	            int val = array[i];
	            int j;
	            for (j = i; j >= gap && array[j - gap]-val > 0; j -= gap) {
	                array[j] = array[j - gap];
	            }
	            array[j] = val;
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShellSort s=new ShellSort();
		int [] array={4,7,6,9,8,3,0,2,1,5};
		System.out.println("start: "+System.currentTimeMillis());
		//mergeSort(array);
		s.shellSort(array);
		System.out.println("e n d: "+System.currentTimeMillis());
	}

}
