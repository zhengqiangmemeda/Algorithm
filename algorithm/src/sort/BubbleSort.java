/**
 * 
 */
package sort;

/**
 * @author zhengqiang
 *
 */
public class BubbleSort {

	public void bubbleSort(int[] array){
		for(int j=0;j<array.length-1;j++){
			for(int i=0;i<array.length-1-j;i++){
					if(array[i]>array[i+1]){
						int temp=array[i];
						array[i]=array[i+1];
						array[i+1]=temp;
					}
			}
		}
	}
	/*
	public <T extends Comparable<T>>void bubbleSort(T[] array){
		for(int j=0;j<array.length-1;j++){
			for(int i=0;i<array.length-1-j;i++){
					if(array[i].compareTo(array[i+1])>0){
						T temp=array[i];
						array[i]=array[i+1];
						array[i+1]=temp;
					}
			}
		}
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs=new BubbleSort();
		Integer [] array={3,0,2,1,5,4,7,6,9,8};
		System.out.println("start: "+System.currentTimeMillis());
		//bs.bubbleSort(array);
		System.out.println("e n d: "+System.currentTimeMillis());
		for(int i:array){
			System.out.println(i);
		}
	}

}
