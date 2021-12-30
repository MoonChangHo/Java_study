package test.problem;

import java.io.IOException;
import java.util.Scanner;

public class Sol_11720 {
    public static void main(String[] args)throws IOException {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum=0;
        String number=s.next();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=number.charAt(i)-'0';        //아스키코드 X-48=y
            //arr[i]=Character.getNumericValue(number.charAt(i));
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}

