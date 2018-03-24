/**
 * 
 */
package dp;

import dp.Bag01ByDP.Bag;

/**
 * @author zhengqiang
 *
 */

class Knapsack{
    /** ��Ʒ���� */
    private int weight;
    /** ��Ʒ��ֵ */
    private int value;

    public Knapsack(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}

public class DTGHProblem {

    // ���е���Ʒ
    private Knapsack[] bags;
    // ��Ʒ������
    private int n;
    // �����ܳ���
    private int totalWeight;
    // ��һά����ǰ�ڼ�����Ʒ���ڶ�ά����ǰ�ı������أ�ֵ����ǰ��������ֵ
    private int[][] bestValues;
    // ���ձ���������ֵ
    private int bestValue;

    public DTGHProblem(Knapsack[] bags, int totalWeight) {
        this.bags = bags;
        this.totalWeight = totalWeight;
        this.n = bags.length;
        if (bestValues == null) {
            // ����0��״̬+1����ֹ����Ǳ�Խ��
            bestValues = new int[n + 1][totalWeight + 1];
        }
    }

    public void solve() {
        // ���������ĳ���
        for (int j = 0; j <= totalWeight; j++) {
            // ����ָ����Ʒ
            for (int i = 0; i <= n; i++) {
                // ��������������Ʒ�����Ϊ0ʱ��������ֵ��Ϊ0
                if (i == 0 || j == 0) {
                    bestValues[i][j] = 0;
                } else {
                    // ����� i����Ʒ���������ܳ��أ������Ž������ǰ i-1 ��������
                    if (j < bags[i - 1].getWeight()) {
                        bestValues[i][j] = bestValues[i - 1][j];
                    } else {
                        // ����� i����Ʒ�������ܳ��أ������Ž�Ҫô�ǰ����� i�����������Ž⣬
                        // Ҫô�ǲ������� i�����������Ž⣬ ȡ�������ֵ
                        int weight = bags[i - 1].getWeight();
                        int value = bags[i - 1].getValue();
                        bestValues[i][j] = Math.max(bestValues[i - 1][j], value
                                + bestValues[i - 1][j - weight]);
                    }
                }
            }
        }

        bestValue = bestValues[n][totalWeight];
    }

    public int getBestValue() {
        return bestValue;
    }
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Knapsack[] bags = new Knapsack[] { 
    			new Knapsack(2, 6),new Knapsack(2, 3), new Knapsack(6, 5), 
    			new Knapsack(5, 4),new Knapsack(4, 6), };
        int totalWeight = 10;
        DTGHProblem problem = new DTGHProblem(bags, totalWeight);

        problem.solve();
        System.out.println(problem.getBestValue());

	}

}
