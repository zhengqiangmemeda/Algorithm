/**
 * 
 */
package dp;

/** 
 * @ClassName: LCS 
 * @Description: 最长公共子串
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-09 22:49
 */
public class ContinusLCS {


	public int getContinusLCS(String s1,String s2){
		int maxLen=0;
		int size1=s1.length();
		int size2=s2.length();
		if(size1==0 || size2==0){
			return 0;
		}
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		int[][] dp=new int[size1+1][size2+1];
		for(int i=1;i<=size1;i++){
			for(int j=1;j<=size2;j++){
				dp[i][j]=0;
			}
		}
		
		for(int i=1;i<=size1;i++){
			for(int j=1;j<=size2;j++){
				if(c1[i]==c2[j]){
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else{
					dp[i][j]=0;
				}
				if(maxLen<dp[i][j]){
					maxLen=dp[i][j];
				}
			}
		}
		
		return maxLen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContinusLCS lcs=new ContinusLCS();
		String s1="abcde";
		String s2="abgde";
		System.out.println(lcs.getContinusLCS(s1, s2));
	}

}
