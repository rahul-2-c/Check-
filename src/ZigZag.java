
public class ZigZag {

	int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public int longestZigZag(int[] A) {
		int n = A.length;

		int[][] Z = new int[n][2];
		int s = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if((A[i]>A[j]) && Z[i][0]<(Z[j][1] +1)){
					Z[i][0]=Z[j][1];
				}
				if((A[i]<A[j]) && Z[i][1]<(Z[j][0]+1)){
					Z[i][1]=Z[j][0];
				}
				
			}
			if (s < max(Z[i][0],Z[i][1]))
					s = max(Z[i][0],Z[i][1]);
		}

		return s;
	}

}
