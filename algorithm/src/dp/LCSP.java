package dp;

import java.util.Stack;

/**
 * @ClassName: LCSP
 * @Description: Longest-conmmon-subsequence problem
 * @author zhengqiang
 * @Email 1126686939@qq.com
 * @date 2018年4月6日 下午4:11:00
 */
public class LCSP {

	public static int[][] lcs(String s1, String s2) {
		String lcs = "";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int length1 = c1.length;
		int length2 = c2.length;
		int[][] dp = new int[length1 + 1][length2 + 1];
		int[][] root = new int[length1 + 1][length2 + 1];

		for (int i = 0; i <= length1; i++)
			dp[i][0] = 0;
		for (int j = 0; j <=length2; j++)
			dp[0][j] = 0;

		for (int i = 1; i < length1 + 1; i++) {
			for (int j = 1; j < length2 + 1; j++) {
				if (c1[i - 1] == c2[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					root[i][j] = 0;// 左上角
				} else if (dp[i - 1][j] > dp[i][j - 1]) {
					dp[i][j] = dp[i - 1][j];
					root[i][j] = 1;// 向上
				} else {
					dp[i][j] = dp[i][j - 1];
					root[i][j] = -1;// 向左
				}
			}
		}
		//
		//System.out.println(dp[length1][length2]);

		return root;
	}

	public static void PrintLCS(int [][]root, String s1, int i, int j)  
	{  
		StringBuffer sb=new StringBuffer();
	    if(i==0 || j==0)  
	        return ;  
	    if(root[i][j]==0)  
	    {  
	        PrintLCS(root, s1, i-1, j-1);//从后面开始递归，所以要先递归到子串的前面，然后从前往后开始输出子串  
	        //sb.append(s1.charAt(i-1));//c[][]的第i行元素对应str1的第i-1个元素  
	        System.out.print(s1.charAt(i-1));;
	    }  
	    else if(root[i][j]==1)  
	        PrintLCS(root, s1, i-1, j);  
	    else  
	        PrintLCS(root, s1, i, j-1); 
	}
	
	public static void main(String[] args){
		String s1="fjssharpsword";
		String s2="helloworld";
		int[][] root=lcs(s1,s2);
		PrintLCS(root,s1,s1.length(),s2.length());
	}
}
