/**
 * 
 */
package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengqiang
 *活动选择问题
 */
public class ActivitySelection {

	/**
	 * @param args
	 */
	class Activity{
		
		private double start;
		private double end;
		
		Activity(){

		}
		Activity(double a,double b){
			this.start=a;
			this.end=b;
		}
		
		public Activity[] initActivityByArray(double[] s,double[] e){
			int size=s.length;
			Activity[] c=new Activity[size];
			for(int i=0;i<size;i++){
				c[i]=new Activity(s[i],e[i]);
			}
			return c;
			}
		
		Boolean compare(Activity b){
			if(this.end<=b.start)
				return true;
			return false;
		}
		
	}
	//
	
	public static Activity[] sort(Activity[] a){
		int size=a.length;
		for(int i=1;i<size;i++){
			for(int j=i-1;j>0;j--){
				if(a[i].compare(a[j])){
					Activity temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	public static void printH(Activity[] c){
		for(Activity a:c)
			System.out.println(a.start+" , "+a.end);
	}
	
	public static void printL(List<Activity> l){
		for(Activity a:l)
			System.out.println(a.start+" , "+a.end);
	}
	
	public static ArrayList<Activity>  getMaxActivitySet(Activity[] a){
		Activity[] b=sort(a);
		ArrayList<Activity> r=new ArrayList<Activity>();
		r.add(0, b[0]);
		int k=0;
		for(int i=1;i<b.length;i++){
			if(r.get(r.size()-1).compare(b[i])){
				r.add(b[i]);
			}
		}
		
		return r;
		
	}
	public static void main(String[] printH) {
		// TODO Auto-generated method stub
		double[] s={1,3,0,5,3,5,6,8,8,2,12};
		double[] e={4,5,6,7,9,9,10,11,12,14,16};
		ActivitySelection as=new ActivitySelection();
		Activity aa = as.new Activity();
		
		Activity[] c=aa.initActivityByArray(s,e);
		Activity[] sortc=sort(c);
		
		ArrayList<Activity> r=getMaxActivitySet(c);
		System.out.println("===========");
		//printH(sortc);
		printL(r);
	}

}
