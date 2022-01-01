package test.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sol_2675 {
    public static void main(String[] args)throws IOException {
        /*
        Scanner a= new Scanner(System.in);
        int testCase=a.nextInt();
        int num;
        String s;
        for(int i=0;i<testCase;i++) {
            num=a.nextInt();
            s=a.next();
            for(int j=0;j<s.length();j++){
                for(int k=0;k<num;k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println("");
        }
        */

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder a=new StringBuilder();

        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String[] str=br.readLine().split(" ");
            int num=Integer.parseInt(str[0]);

            for(int k=0;k<str[1].length();k++){
                for (int j=0;j<num;j++){
                    a.append(str[1].charAt(k));
                }
            }
            a.append("\n");
        }
        System.out.print(a);

    }
}
