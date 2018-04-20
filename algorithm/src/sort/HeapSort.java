/**
 * 
 */
package sort;

/**
 * @author zhengqiang
 *
 */
public class HeapSort {
	
	private int[] data;
	
	public HeapSort(int[] data){
		this.data=data;
		buidlMaxHeap(data);
	}

	public static int getParentIndex(int current){
		return (current-1)>>1;
	}
	
	public static int getLeftChildIndex(int current){
		return (current<<1)+1;
	}
	
	public static int getRightChildIndex(int current){
		return (current<<1)+2;
	}
	
	public void maxHeapify(int[]arr, int from, int to){
		int left=getLeftChildIndex(from);
		int right=getRightChildIndex(from);
		int largest=from;
		if(left<to && arr[left]>arr[from]){
			largest=left;
		}
		if(right<to && arr[right]>arr[largest]){
			largest=right;
		}
		if(largest!=from){
			int temp=arr[from];
			arr[from]=arr[largest];
			arr[largest]=temp;
			maxHeapify(arr,largest,to);
		}
	}
	
	public void buidlMaxHeap(int[]arr){
		for(int i=getParentIndex(arr.length-1);i>=0;i--){
			maxHeapify(arr, i, arr.length-1);
		}
	}
	
	public void heapSort(){
		buidlMaxHeap(data);
		for(int i=data.length-1;i>=0;i--){
			int temp=data[0];
			data[0]=data[i];
			data[i]=temp;
			maxHeapify(data, 0, i-1);
		}
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[] a={9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8,9,10,12,11,15,14,16,18,17,19,25,21,24,26,23,22,29,30};
		HeapSort h=new HeapSort(a);
		h.heapSort();
		for(int m:a){
			System.out.print(m+",");
		}
	}

}
