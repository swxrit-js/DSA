class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] temp = new int[n][m];

        for (int q = 0; q < n; q++) {
            for (int w = 0; w < m; w++) {
                temp[q][w] = matrix[q][w];
            }
        }

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        
        for(int i=top;i<=bottom;i++)
        {
            for(int j=left;j<=right;j++)
            {
                if(temp[i][j]==0)
                {
                    for(int k=0;k<m;k++)
                    {
                        matrix[i][k]=0;
                    }
                    for(int k=0;k<n;k++)
                    {
                        matrix[k][j]=0;
                    }
                }
            }
        }
    }
}
