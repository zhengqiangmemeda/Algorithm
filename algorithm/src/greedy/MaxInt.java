/**
 * 
 */
package greedy;

import greedy.ActivitySelection.Activity;

/**
 * @author zhengqiang
 *���������������n�������������������ӳ�һ�ţ����һ�����Ķ�λ������ 
���磺n=3ʱ��3������13��312��343�����ɵ��������Ϊ34331213�� 
���磺n=4ʱ��4������7��13��4��246�����ɵ��������Ϊ7424613�� 
 */
public class MaxInt {

	/**
	 * @param args
	 */
	public static int[] sortInt(int[] num){
		//int[] sortNum=new int[num.length];
		for(int i=1;i<num.length;i++){
			for(int j=i-1;j>0;j--){
				if(compareInt(num[i],num[j])){
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}			
		}
		return num;
		
	}
	
	public static Boolean compareInt(int a,int b){
		String sa=a+"";
		String sb=b+"";
		String s1=sa+sb;
		String s2=sb+sa;
		if(s1.compareTo(s2)<0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={12,121};
		int[] b=sortInt(a);
		for(int i=0;i<b.length;i++){
			System.out.println(new Integer(b[i]).toString()+"-");
		}

	}

}
