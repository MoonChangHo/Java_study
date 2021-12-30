package test.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Sol_1065 {
    public  int count1(int n){
        int count=99;
        int hundred,ten,first;

        if(n==1000)
            n=999;

        if(n<100)
            return n;

        else if(n<1000) {
            for(int i=100;i<=n;i++) {
                hundred = i / 100;
                ten = (i /10) % 10;
                first = i% 10;
                if ((hundred - ten) == (ten - first)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)throws IOException {
        Sol_1065 s=new Sol_1065();
        BufferedReader br=
                new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        System.out.println(s.count1(n));


    }
}
