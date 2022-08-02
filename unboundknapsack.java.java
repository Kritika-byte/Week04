class Knapsack {
	staticint max(int a, int b) { return (a > b) ? a : b; }
	staticintunboundedKnapsack(int W, intwt[], intval[],
								intidx)
	{
		if (idx == 0) {
			return (W / wt[0]) * val[0];
		}
		intnotTake
			= 0 + unboundedKnapsack(W, wt, val, idx - 1);
		int take = Integer.MIN_VALUE;
		if (wt[idx] <= W) {
			take = val[idx]
				+ unboundedKnapsack(W - wt[idx], wt, val,
									idx);
		}
		return max(take, notTake);
	}
	public static void main(String args[])
	{
		int W = 100;
		intval[] = { 10, 30, 20 };
		intwt[] = { 5, 10, 15 };
		int n = val.length;
		System.out.println(
			unboundedKnapsack(W, wt, val, n - 1));
	}
}
