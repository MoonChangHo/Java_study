package test.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Sol_10757 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger A = s.nextBigInteger();
        BigInteger B = s.nextBigInteger();

        System.out.println(A.add(B));
    }
}
