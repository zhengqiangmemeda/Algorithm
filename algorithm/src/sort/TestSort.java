package sort;

import org.junit.Test;

public class TestSort {

	@Test
	public void testDirectInsertSort()  {
		DirectInsertSort s=new DirectInsertSort();
		int[] a={9,8,7,6,5,4,3,2,1};
		long startTime=System.nanoTime(); //��ȡ��ʼʱ��
		s.insertSort(a);
		long endTime=System.nanoTime(); //��ȡ����ʱ��
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ns");
		for(int m:a){
			System.out.print(m+",");
		}
		System.out.println();
	}
	
	@Test
	public void testShellSort()  {
		ShellSort s=new ShellSort();
		int[] a={9,8,7,6,5,4,3,2,1};
		long startTime=System.nanoTime(); //��ȡ��ʼʱ��
		s.shellSort(a);
		long endTime=System.nanoTime(); //��ȡ����ʱ��
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ns");
		for(int m:a){
			System.out.print(m+",");
		}
		
	}

}
