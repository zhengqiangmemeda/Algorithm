/**
 * 
 */
package greedy;

/**
 * @author zhengqiang
 *ÕÒÁãÇ®ÎÊÌâ
 */
public class GiveChangeByGreedy {

	/**
	 * @param args
	 */
	
	public static int[] getMoneyNum(float change,float[] moneySize){
		int moneyNum[]=new int[moneySize.length];
		while(change>0){
			for(int i=0;i<moneySize.length;i++){
				moneyNum[i]=(int) (change/moneySize[i]);
				change=change-moneyNum[i]*moneySize[i];
			}
		}
		
		return moneyNum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float moneySize[]={100,50,20,10,5,2,1};
		int moneyNum[]=new int[moneySize.length];
		float change=212f;
		moneyNum=getMoneyNum(change,moneySize);
		
		for(int i=0;i<moneyNum.length;i++){
			System.out.println(moneySize[i]+"-"+moneyNum[i]);
		}
		

	}

}
