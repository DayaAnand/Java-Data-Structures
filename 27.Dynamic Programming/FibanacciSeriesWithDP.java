import java.util.*;
class FibanacciSeriesWithDP{
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        System.out.println("Fibanacci Series with Memoization (Top-Down Approach)");
        System.out.println(fibMemo(6, hm));
        System.out.println("Fibanacci Series with Tabulation (Bottom-Up Approach)");
        System.out.println(fibTabulation(6));
    }

    //Fibanacci series with Memoization (Top-Down Approach)
    public static int fibMemo(int n,HashMap<Integer,Integer> memo){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(!memo.containsKey(n)){
            memo.put(n,(fibMemo(n-1, memo)+ fibMemo(n-2, memo)));
        }
        return memo.get(n);
    }

    //Fibanacci Series with Tabulation (Bottom-Up Approach)
    public static int fibTabulation(int n){
        ArrayList<Integer> tb = new ArrayList<>();
        tb.add(0);
        tb.add(1);
        for(int i=2;i<=n-1;i++){
            int n1=tb.get(i-1);
            int n2=tb.get(i-2);
            tb.add(n1+n2);

        }
        return tb.get(n-1);
    }
}