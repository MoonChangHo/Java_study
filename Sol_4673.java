package test.problem;

public class Sol_4673 {
    public int d(int n){
        int sum=n;

        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Sol_4673 s = new Sol_4673();
        boolean[] check = new boolean[10001];
        for (int i = 1; i < check.length; i++) {
            int n = s.d(i);
            if(n<10001) {
                check[n] = true;
            }
        }
        for (int i=1;i<check.length;i++){
            if (!check[i]){
                System.out.println(i);
            }
        }
    }
}
