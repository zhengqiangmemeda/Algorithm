package stringMatch;

/** 
 * @ClassName: KMP 
 * @Description: https://www.cnblogs.com/cherryljr/p/6519748.html
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @date 2018年4月6日 下午2:01:08 
 */
public class KMP {


	public int[] getNext(String p){
		char[] arr=p.toCharArray();
		int[] next=new int[p.length()];
		next[0]=-1;
		next[1]=0;
		int preNext=0;
		for(int i=2;i<p.length();i++){
			if(arr[i-1]==arr[preNext]){
				preNext++;
				next[i]=preNext;
			}
			else if(preNext<=0){
				next[i]=0;
			}
			else{
				preNext=next[preNext];
			}
		}
		return next;
	}
	
	public int getIndex(String s,String p){
		KMP kmp=new KMP();
		int[] next=kmp.getNext(p);
		char[] ss=s.toCharArray();
		char[] pp=p.toCharArray();
		int i=0,j=0;
		while(i<ss.length && j<pp.length){
			if(j==-1 || ss[i]==pp[j]){
				i++;
				j++;
			}
			else{
				j=next[j];
			}
		}
		return j==pp.length?i-j:-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KMP kmp=new KMP();
		String s="BBC ABCDAB ABCDABCDABDE";
		String p="ABCDABD";
		int[] next=kmp.getNext(p);
		int index=kmp.getIndex(s, p);
		for(int i:next){
			System.out.print(i+",");
		}
		System.out.println();
		System.out.print(index);

	}

}
