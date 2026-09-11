class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];

        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }

        List<List<String>> ans=new ArrayList<>();

        int colIndex=0;

        solve(board,n,ans,colIndex);

        return ans;

    }
    static void solve(char[][] board,int n, List<List<String>> ans, int colIndex)
    {
        if(colIndex>=n)
        {
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
            temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int rowIndex=0;rowIndex<n;rowIndex++)
        {
            if(isSafeToPlace(rowIndex,colIndex,n,board))
            {
                board[rowIndex][colIndex]='Q';

                solve(board,n,ans,colIndex+1);

                board[rowIndex][colIndex]='.';
            }
        }
    }

    static boolean isSafeToPlace(int rowIndex,int colIndex,int n, char[][] board)
    {
        int row=rowIndex;
        int col=colIndex;
        while(col>=0)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            col--;
        }
        row=rowIndex;
        col=colIndex;
        while(row>=0 && col>=0)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            col--;
            row--;
        }
        row=rowIndex;
        col=colIndex;
        while(row<n && col>=0)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
}