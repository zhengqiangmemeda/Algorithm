/**
 * 
 */
package sort;

/**
 * @author zhengqiang
 *
 */


public class DirectInsertSort<T> implements Comparable<T>{

	/**
	 * @param <T>
	 * @param args
	 */
	
	public static <T> void insertSort(int[] array){
		int length=array.length;
		for(int i=1;i<length;i++){
			int temp=array[i];
			for(int j=i-1;j>=0;j--){
				if(array[j]>temp){
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array={3,0,2,1,5,4,7,6,9,8};
		insertSort(array);
		for(int i:array){
			System.out.println(i);
		}

	}



	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
