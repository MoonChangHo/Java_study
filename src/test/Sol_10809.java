package test.problem;

import java.util.Scanner;

public class Sol_10809 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.next();
        for(int i=0;i<26;i++) {
            System.out.print(word.indexOf('a'+i));
            System.out.print(" ");
        }
    }
}
