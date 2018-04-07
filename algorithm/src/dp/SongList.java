package dp;

import java.util.Scanner;

/**
 * @ClassName: SongList
 * @Description: 有长度为分别为A、B的两种类型的歌曲（A!=B），A、B歌曲的数量分别为X,Y首，现要组成一首长度为K的歌单，
 * 求组合种类数（不考虑歌单内的歌曲顺序）
 * @author zhengqiang
 * @Email 1126686939@qq.com
 * @date 2018年4月5日 下午8:05:54
 */
public class SongList {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int K = sc.nextInt();
			int A = sc.nextInt();
			int X = sc.nextInt();
			int B = sc.nextInt();
			int Y = sc.nextInt();
			
			int[][] dp = new int[X+Y+1][K+1];
			
			for (int i = 0; i < X+Y+1; i++)
				dp[i][0] = 1;
			
			for (int i = 1; i < X+Y+1; i++) {
				for (int j = 1; j <= K; j++) {
					if (i <= X) {
						if (j >= A) dp[i][j] = (dp[i-1][j] + dp[i-1][j-A]) % 1000000007;
						else dp[i][j] = dp[i-1][j] % 1000000007;
						}
					else if (i <= X+Y) {
						if (j >= B) dp[i][j] = (dp[i-1][j] + dp[i-1][j-B]) % 1000000007;
						else dp[i][j] = dp[i-1][j] % 1000000007;
						}
				}
			}
			System.out.println(dp[X+Y][K]);
			}
}
