/**
 * 
 */
package dp;

/**
 * @author zhengqiang
 *
 */
public class MutrixMultiply {

	/**
	 * @param args
	 */
	public static int[][] getMultiply(int[][] a,int[][] b){
		int aRow=a.length;
		int aCol=a[0].length;
		
		int bRow=b.length;
		int bCol=b[0].length;
		
		System.out.println("(aRow="+aRow+",aCol="+aCol+")*(bRow="+bRow+",bCol="+bCol+")");
		
		int[][] c = new int[aRow][bCol];
		for(int i=0;i<aRow;i++)
			for(int j=0;j<bCol;j++)
				c[i][j]=0;
		
		if(aCol!=bRow){
			System.out.println("(aCol="+aCol+",bRow="+bRow+") a's col is not equial to b's row!");
			return null;
		}
		else{
			for(int i=0;i<aRow;i++){
				for(int j=0;j<bCol;j++){
					for(int m=0;m<aCol;m++){
						c[i][j]=c[i][j]+a[i][m]*b[m][j];
					}
				}
			}
		}
		
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,3},{4,5,6}};
		int b[][]={{1,4},{2,5},{3,6}};
		int c[][]=null;
		/*the output should be the following
		 * 14,32,
		 * 32,77,
		 * */
		c=getMultiply(a,b);
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[0].length;j++)
				System.out.print(c[i][j]+",");
			System.out.println();
		}
		

	}

}
