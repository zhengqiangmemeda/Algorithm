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
	 * ������������һ���߶�Ϊn����¥�ݣ����������ߣ�ÿ��һ��ֻ������1������2��̨�ף����һ���ж������߷���
	 * ��������Ϊÿ1��ֻ����1������2���������ߵ���n����ǰһ������ֻ�����������
	 * ��һ������Ǵӵ�n - 1����1�����ڶ�������Ǵӵ�n - 2����2�����ɴ����ǾͿ��Եõ�������ĵݹ鹫ʽ��

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
