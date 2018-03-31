/**
 * 
 */
package sort;

/**
 * @author zhengqiang
 *
 */
public class SimpleSelectSort {


	public void simpleSelectSort(int[] arr){
		int minIndex=0;
		for(int i=0;i<arr.length-1;i++){
			minIndex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			if(i!=minIndex){
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
			}	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={9,5,8,6,7,4,1,3,2};
		SimpleSelectSort ss=new SimpleSelectSort();
		ss.simpleSelectSort(arr);
		for(int m:arr)
		System.out.print(m+",");
	}

}
