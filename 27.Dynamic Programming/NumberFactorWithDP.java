public class NumberFactorWithDP {
    private static int waysToGetTopDown(int[] dp,int n){
        if(n==0 || n==1||n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        if(dp[n]==0){
            int sp1= waysToGetTopDown(dp, n-1);
            int sp2=waysToGetTopDown(dp, n-3);
            int sp3=waysToGetTopDown(dp, n-4);
            dp[n]=sp1+sp2+sp3;
        }
        return dp[n];
    }
    public static int waysToGetTopDown(int n){
        int dp[] = new int[n+1];
        return waysToGetTopDown(dp,n);
    }
    public static int waysToGetBottomUp(int n){
        int dp[] =new int[n+1];
        dp[0]=dp[1]=dp[2]=1;
        dp[3]=2;
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-3]+dp[i-4];
        }
        return dp[n];
    }
    // public static int waysToGetBottomUp
    public static void main(String[] args) {
        System.out.println("Number Factor with Top Down Approach");
        System.out.println(waysToGetTopDown(5));
        System.out.println("NUmber Factor with Bottom-Up Approach");
        System.out.println(waysToGetBottomUp(5));
    }
}
