package test.problem.Bronze;

import java.util.Scanner;

public class Sol_10430 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();

        int sol1=(A+B)%C;
        int sol1_1=((A%C) + (B%C))%C;
        int sol2=(A*B)%C;
        int sol2_1=((A%C) * (B%C))%C;

        System.out.println(sol1);
        System.out.println(sol1_1);
        System.out.println(sol2);
        System.out.println(sol2_1);
    }
}
