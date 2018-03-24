/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author zhengqiang
 *
 */
class Edge implements Comparable<Edge>{
	private int start;
	private int end;
	private int weight;
	Edge(int s, int e, int w){
		this.start=s;
		this.end=e;
		this.weight=w;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		if(this.getWeight()!=o.getWeight()){
			if(this.getWeight()>o.getWeight())
				return 1;
			else
				return -1;
		}else{
			if(this.getStart()==o.getStart() && this.getEnd()==o.getEnd())
				return 0;
			else
				return 1;		
		}	
	}
	
	@Override
	public String toString(){
		return "(start:"+start+" , end:"+end+" , weight:"+weight+")";
	}
	
}//end of class Edge

public class Kruskal {

	/**
	 * @param args
	 */
	public TreeSet<Edge> getMSTByKruskal(TreeSet<Edge> G, int[] V){
		TreeSet<Edge> MST=new TreeSet<Edge>();
		ArrayList<HashSet> Vsets=new ArrayList<HashSet>();
		for(int e : V){
			HashSet<Integer> Vset=new HashSet<Integer>();
			Vset.add(e);
			Vsets.add(Vset);
			//System.out.println(set.hashCode());
		}
		//
		for(Edge e: G){
			int start=e.getStart();
			int end=e.getEnd();
			int sIndex=-1;
			int eIndex=-2;
			for(int i=0;i<Vsets.size();i++){
				HashSet<Integer> set=Vsets.get(i);
				if(set.contains(start)){
					sIndex=i;
				}
				if(set.contains(end)){
					eIndex=i;
				}
			}
			if(sIndex<0 || eIndex<0){
				System.err.println("没有在子树中找到节点，错误");  
			}
			if(sIndex!=eIndex){
				MST.add(e);
				HashSet<Integer> setI=Vsets.get(sIndex);
				HashSet<Integer> setJ=Vsets.get(eIndex);
				if(sIndex<eIndex){
					Vsets.remove(eIndex);
					Vsets.remove(sIndex);
				}
				else{
					Vsets.remove(sIndex);
					Vsets.remove(eIndex);				
				}
				
				setI.addAll(setJ);
				Vsets.add(setI);
			}
			
		}
			
		return MST;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kruskal k=new Kruskal();
		int[] V={1,2,3,4,5,6};
		TreeSet<Edge> E=new TreeSet<Edge>();
		E.add(new Edge(1,2,6));  
		E.add(new Edge(1,3,1));  
		E.add(new Edge(1,4,5));  
		E.add(new Edge(2,3,5));  
		E.add(new Edge(2,5,3));  
		E.add(new Edge(3,4,5));  
		E.add(new Edge(3,5,6));  
		E.add(new Edge(3,6,4));  
		E.add(new Edge(4,6,2));  
		E.add(new Edge(5,6,6)); 

		//
		TreeSet<Edge> resultSet=new TreeSet<Edge>();
		resultSet=k.getMSTByKruskal(E,V);
		for(Edge e: resultSet){
			System.out.println(e.toString());
		}
	}

}
