package graph;

import java.util.ArrayList;

class Vertex{
	int no;
	/*private*/ String name;
	/*private*/ Vertex parent;
	/*private*/ ArrayList<Vertex> Adj=new ArrayList<Vertex>();//邻接链表
	/*private*/ int discoverTime;
	/*private*/ int finishTime;
	/*private*/ String color;
	
//	public ArrayList<Vertex> getAdj() {
//		return Adj;
//	}
//	public void setAdj(ArrayList<Vertex> adj) {
//		Adj = adj;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Vertex getParent() {
//		return parent;
//	}
//	public void setParent(Vertex parent) {
//		this.parent = parent;
//	}
//	public int getDiscoverTime() {
//		return discoverTime;
//	}
//	public void setDiscoverTime(int discoverTime) {
//		this.discoverTime = discoverTime;
//	}
//	public int getFinishTime() {
//		return finishTime;
//	}
//	public void setFinishTime(int finishTime) {
//		this.finishTime = finishTime;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
	public Vertex(){}
	public Vertex(int no,String name){
		this.no=no;
		this.name=name;
	}	
	
}
class Graphy{
	int vertexNum;
	int edgeNum;
	Vertex[] vertexArr;
	int[][] matrix;
	int time=0;
				
	public Graphy createGraph(String[] vertexName, int[][] mat){
		Graphy g=new Graphy();
		g.matrix=mat;
		g.vertexNum=vertexName.length;
		g.vertexArr=new Vertex[vertexName.length];

		for(int i=0;i<vertexName.length;i++){
			Vertex v=new Vertex(i+1,vertexName[i]);
			v.discoverTime=0;
			v.finishTime=0;
			v.color="WHITE";
			v.parent=null;
			g.vertexArr[i]=v;
		}
		
		for(int i=0;i<vertexName.length;i++){
			for(int j=0;j<vertexName.length;j++){
				if(mat[i][j]==1){
					g.vertexArr[i].Adj.add(g.vertexArr[j]);
					g.edgeNum++;
				}
			}
		}
		return g;
	}
	public void dfsVisit(Graphy g,Vertex u){
		ArrayList<String> result=new ArrayList<String>();
		time+=1;
		u.color="GRAY";
		u.discoverTime=time;
		
		for(int i=0;i<u.Adj.size();i++){
			Vertex v=u.Adj.get(i);
			if("WHITE".equals(v.color)){
				v.parent=u;
				dfsVisit(g,v);		
			}
			u.color="BLACK";
			time+=1;
			u.finishTime=time;
			System.out.println(u.no);
			//result.add(u.name);
		}
		//return result;
	}
	public void dfs(Graphy g){
		ArrayList<String> result=new ArrayList<String>();
		for(int i=0;i<g.vertexNum;i++){
			Vertex u=g.vertexArr[i];
			if("WHITE".equals(u.color)){
				dfsVisit(g,u);
			}
		}
		//return result;
	}
	
	
	
}
/** 
 * @ClassName: DFS 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @date 2018年4月3日 上午9:56:24 
 */
public class DFS {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vertexName={"a","b","c","d","e","f"};//the name of vertex by order
		int[][] matrix={
				{0,1,0,1,0,0},
				{0,0,0,0,1,0},
				{0,0,0,0,1,1},
				{0,1,0,0,0,0},
				{0,0,0,1,0,0},
				{0,0,0,0,0,1}		
		};
		Graphy graphy=new Graphy();
		Graphy g=new Graphy();
		graphy=g.createGraph(vertexName, matrix);
		/*
		for(int i=0;i<graphy.vertexNum;i++){
			System.out.print(graphy.vertexArr[i].no+"-->");
			for(int j=0;j<graphy.vertexArr[i].Adj.size();j++){
				System.out.print(graphy.vertexArr[i].Adj.get(j).no);
				if(j!=graphy.vertexArr[i].Adj.size()-1){
					System.out.print("-->");
				}
			}
			System.out.println();
		}
		*/
		
		@SuppressWarnings("unused")
		ArrayList<String> result=new ArrayList<String>();
		g.dfs(graphy);
		//for(String i:result){
			//System.out.println(i);
		//}
	}

}
