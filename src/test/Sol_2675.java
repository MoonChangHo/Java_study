package test.problem;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Sol_2675 {
    public static void main(String[] args) {
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

    }
}
