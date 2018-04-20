/**
 * 
 */
package sort;

/** 
 * @ClassName: TopK 
 * @Description: TODO()
 * @author zhengqiang
 * @Date 2018-04-17 08:58
 */
public class TopMinK {


	public int[] getTopK(int[] data,int k){
		int[] result=new int[k];
		for(int i=0;i<k;i++){
			result[i]=data[i];
		}
		HeapSort hp=new HeapSort(result);
		for(int j=k;j<data.length;j++){
			if(data[j]<result[0]){
				result[0]=data[j];
				hp.maxHeapify(result,0,k);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8,9,10,12,11,15,14,16,18,17,19,25,21,24,26,23,22,29,30};
		TopMinK tp=new TopMinK();
		int[] r=tp.getTopK(a, 5);
		for(int m:r){
			System.out.print(m+",");
		}

	}

}
