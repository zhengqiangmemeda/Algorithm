/**
 * 
 */
package dp;

import java.util.ArrayList;

/**
 * @author zhengqiang
 *
 */
public class Bag01ByDP {

	/**
	 * @param args
	 */
	class Bag{
		private int weight;
		private int value;
		private String name;
		Bag(int w,int v,String n){
			this.weight=w;
			this.value=v;
			this.name=n;
		}
	}
	
	public int get01BagAnswerByDP(Bag[] bagItem,int bagSize){
		
		int[][] bagMatrix=new int[bagItem.length+1][bagSize+1];
		
		for(int i=0;i<=bagSize;i++){
			for(int j=0;j<=bagItem.length;j++){
				
				if(i==0 || j==0){
					bagMatrix[j][i]=0;
				}
				else{
					//如果装不下
					if(bagItem[j-1].weight>i){
						bagMatrix[j][i]=bagMatrix[j-1][i];
					}
					//如果装得下
					else{
						bagMatrix[j][i]=Math.max(bagMatrix[j-1][i],bagMatrix[j-1][i-bagItem[j-1].weight]+bagItem[j-1].value);
					}	
				}

			}
			
		}
		//find answer
//		ArrayList<String> answers = null;
//		
//		int curBagSize=0;
//		for(int i=bagItem.length-1;i>=0;i--){
//			Bag item=bagItem[i];
//			if(curBagSize==0)
//				break;
//			if(i==0 && curBagSize>0){
//				answers.add(item.name);
//				break;
//			}
//			if(bagMatrix[i][curBagSize]-bagMatrix[i-1][curBagSize-item.weight]==item.value)  
//	        {  
//	            answers.add(item.name);  
//	            curBagSize -= item.weight;  
//	        }  
//			
//		}
		
		
		return bagMatrix[bagItem.length][bagSize];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] bagName={"a","b","c","d","e"};  
		int[] weightArr={2,2,6,5,4};  
		int[] valueArr={6,3,5,4,6};  
		Bag[] bagItems=new Bag[bagName.length];  
		for(int i=0;i<bagName.length;i++)  
		{  
		    Bag item= new Bag01ByDP().new Bag(valueArr[i],weightArr[i],bagName[i]);  
		    bagItems[i]=item;  
		} 
		Bag01ByDP dp=new Bag01ByDP();
		int answers= dp.get01BagAnswerByDP(bagItems,10);  
		System.out.println(answers);
//		for(String s:answers){
//			System.out.println(s+" , ");
//		}

	}

}
