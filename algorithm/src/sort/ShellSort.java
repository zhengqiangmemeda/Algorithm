/** 
* @Project : algorithm
* @Title : ShellSort.java
* @Package sort
* @Description : TODO
* @author zhengqiang
* @1126686939.com
* @date 2018年3月23日 下午9:26:12
* @Copyright : 2018 zhengqiang All rights reserved.
* @version V1.0 
*/
package sort;

/**
  * @ClassName ShellSort
  * @Description TODO
  * @author zhengqiang
  * @Email 1126686939@qq.com
  * @date 2018年3月23日
*/
public class ShellSort {

	/** 
	* @Title: main 
	* @Description: TODO
	* @param @param args    设定文件
	* @return void    返回类型 
	* @throws 
	*/
	public static void shellSort1(int[] array){
			
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
	public void shellSort2(int[]a){
		int size=a.length;
		int gap=size/2;
		while(gap>0){
			for(int i=0;i<gap;i++){
				for(int j=i+gap;j<size;j+=gap){
					for(int k=j;k>=i;k-=gap){
						if(a[k]<a[k-gap]){
							int temp=a[k];
							a[k]=a[k-gap];
							a[k-gap]=temp;
						}
					}
					
				}
			}
			gap/=2;
		}
		
	}
	
	public void shellSort(int a[])
	{
		int size=a.length;
		int gap=size/3+1;
		while(gap>=1){
			for(int i=gap;i<size;i++){
				for(int j=i;j>=gap && a[j]<a[j-gap] ;j-=gap){
					int temp=a[j];
					a[j]=a[j-gap];
					a[j-gap]=temp;
				}
			}
			gap/=3+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShellSort s=new ShellSort();
		int[] a={9,8,7,6,5,4,3,2,1};
		s.shellSort2(a);
		//s.shellSort(a);
		for(int m:a){
			System.out.print(m+",");
		}
	}

}
