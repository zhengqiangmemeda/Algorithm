package sort;

import org.junit.Test;

public class TestSort {

	@Test
	public void testDirectInsertSort()  {
		DirectInsertSort s=new DirectInsertSort();
		int[] a={9,8,7,6,5,4,3,2,1};
		long startTime=System.nanoTime(); //获取开始时间
		s.insertSort(a);
		long endTime=System.nanoTime(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
		for(int m:a){
			System.out.print(m+",");
		}
		System.out.println();
	}
	
	@Test
	public void testShellSort()  {
		ShellSort s=new ShellSort();
		int[] a={9,8,7,6,5,4,3,2,1};
		long startTime=System.nanoTime(); //获取开始时间
		s.shellSort(a);
		long endTime=System.nanoTime(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
		for(int m:a){
			System.out.print(m+",");
		}
		
	}

}
