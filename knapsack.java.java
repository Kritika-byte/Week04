class Knapsack {
	staticint max(int a, int b)
	{
	return (a > b) ? a : b;
	}
	staticintknapSack(int W, intwt[], intval[], int n)
	{
		// Base Case
		if (n == 0 || W == 0)
			return 0;
		if (wt[n - 1] > W)
			returnknapSack(W, wt, val, n - 1);
		else
			return max(val[n - 1]
					+ knapSack(W - wt[n - 1], wt,
								val, n - 1),
					knapSack(W, wt, val, n - 1));
	}
	public static void main(String args[])
	{
		intval[] = new int[] { 60, 100, 120 };
		intwt[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
	}
}
