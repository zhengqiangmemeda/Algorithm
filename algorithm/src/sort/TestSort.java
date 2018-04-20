package sort;

import java.util.Random;

import org.junit.Test;

public class TestSort {

	int[] a={9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8,9,10,12,11,15,14,16,18,17,19,25,21,24,26,23,22,29,30};
	
	
	@Test
	public void testSort()  {
		int ARR_SIZE=1000000;
		int arr[]=new int[ARR_SIZE];
		for(int i=0;i<ARR_SIZE;i++){
			arr[i]=new Random().nextInt(ARR_SIZE);
		}
		//for(int m:arr){
			//System.out.print(m+",");
		//}
		//System.out.println();
		
		int arr1[]=arr;
		int arr2[]=arr;
		int arr3[]=arr;
		int arr4[]=arr;
		int arr5[]=arr;
		int arr6[]=arr;
		
		DirectInsertSort d=new DirectInsertSort();
		ShellSort s=new ShellSort();
		HeapSort h=new HeapSort(arr3);
		QuickSort q=new QuickSort();
		BubbleSort b=new BubbleSort();
		SimpleSelectSort ss=new SimpleSelectSort();
		
		long startTime1=System.currentTimeMillis();//获取开始时间
		//d.insertSort(arr1);
		long endTime1=System.currentTimeMillis(); //获取结束时间
		System.out.println("DirectInsertSort程序运行时间： "+(endTime1-startTime1)+"ms");
		
		long startTime2=System.currentTimeMillis(); //获取开始时间
		s.shellSort(arr2);
		long endTime2=System.currentTimeMillis(); //获取结束时间
		System.out.println("ShellSort程序运行时间： "+(endTime2-startTime2)+"ms");
		
		long startTime3=System.currentTimeMillis(); //获取开始时间
		h.heapSort();
		long endTime3=System.currentTimeMillis(); //获取结束时间
		System.out.println("HeapSort程序运行时间： "+(endTime3-startTime3)+"ms");

		
		long startTime4=System.currentTimeMillis(); //获取开始时间
		//q.quickSort(arr4, 0, arr4.length-1);
		long endTime4=System.currentTimeMillis(); //获取结束时间
		System.out.println("quickSort程序运行时间： "+(endTime4-startTime4)+"ms");
		
		long startTime5=System.currentTimeMillis(); //获取开始时间
		//b.bubbleSort(arr5);
		long endTime5=System.currentTimeMillis(); //获取结束时间
		System.out.println("bubbleSort程序运行时间： "+(endTime5-startTime5)+"ms");
		
		long startTime6=System.currentTimeMillis(); //获取开始时间
		ss.simpleSelectSort(arr6);
		long endTime6=System.currentTimeMillis(); //获取结束时间
		System.out.println("simpleSelectSort程序运行时间： "+(endTime6-startTime6)+"ms");


	}
	
	//@Test
	public void testShellSort()  {
		ShellSort s=new ShellSort();
		long startTime=System.nanoTime(); //获取开始时间
		s.shellSort(a);
		long endTime=System.nanoTime(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
		for(int m:a){
			System.out.print(m+",");
		}
		System.out.println();
	}
	


}
