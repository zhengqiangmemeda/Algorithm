/**
 * 
 */
package dp;

/**
 * @author zhengqiang
 *
 */
public class FibonacciByDP {

	/**
	 * @param args
	 */
	
	public int calFibonacciByDP(int n){
		int[] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<n+1;i++){
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
	public int calFibonacci(int n){
		int result=0;
		if(n<2)
			result=n;
		else{
			return calFibonacci(n-1)+calFibonacci(n-2);
		}

		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciByDP dp=new FibonacciByDP();

//		long startTime=System.currentTimeMillis();
//		int result=dp.calFibonacciByDP(30);
//		long endTime=System.currentTimeMillis();
//		long time=endTime-startTime;
//		System.out.println("result:"+result + "---------time: "+time);
		
		
		long startTime2=System.currentTimeMillis();
		int result2=dp.calFibonacci(30);
		long endTime2=System.currentTimeMillis();
		long time2=endTime2-startTime2;
		System.out.println("result2:"+result2 + "---------time2: "+time2);
		
	}

}
