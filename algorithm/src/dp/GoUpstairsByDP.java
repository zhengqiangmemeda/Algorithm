/**
 * 
 */
package dp;

/**
 * @author zhengqiang
 *
 */
public class GoUpstairsByDP {

	/**
	 * @param args
	 * 问题描述：有一座高度为n级的楼梯，从下往上走，每跨一步只能向上1级或者2级台阶，求出一共有多少种走法。
	 * 分析：因为每1步只能走1级或者2级，所以走到第n级的前一步有且只有两种情况，
	 * 第一种情况是从第n - 1级走1级，第二种情况是从第n - 2级走2级。由此我们就可以得到此问题的递归公式：

		F(1) = 1;
		F(2) = 2;
		F(n) = F(n - 1) + F(n - 2);

	 */
	public int getSum(int n){
		int[] dp=new int[n+1];
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=n;i++){
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoUpstairsByDP dp=new GoUpstairsByDP();
		System.out.println(dp.getSum(5));

	}

}
