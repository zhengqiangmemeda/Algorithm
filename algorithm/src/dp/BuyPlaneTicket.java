/**
 * 
 */
package dp;

/** 
 * @ClassName: BuyPlaneTicket 
 * @Description: 有n家包机商买座位总数为m的飞机票，n家包机商分别可以买n1,n2,n3..n张机票，有没有一种方案从n家
 * 包机商中选择x家使得总票数恰好为m
 * @author zhengqiang
 * @Date 2018-04-14 14:38
 */
public class BuyPlaneTicket {


	boolean isExist(int[]ticket,int total){
		int []dp=new int[total+1];
		for(int i=0;i<total+1;i++){
			dp[i]=i;
		}
		for(int i=0;i<total+1;i++){
			for(int j=0;j<ticket.length;j++){
				if(ticket[j]<=i){
					dp[i]=Math.min(dp[i], dp[i-ticket[j]]+1);
				}
			}
		}
		for(int i=0;i<total+1;i++){
			System.out.println(dp[i]);
		}
		return dp[total]==1000000?false:true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]ticket={10,20,30,40,50};
		//int total=100;
		
		int[]ticket={100,30,20,110,120};
		int total=200;
		
		BuyPlaneTicket bb=new BuyPlaneTicket();
		boolean an=bb.isExist(ticket, total);
		System.out.print(an?"perfect":"good");
		
		
	}

}
