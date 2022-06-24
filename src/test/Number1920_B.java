package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1920_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());
        int[] arr= new int[a];

        StringTokenizer st= new StringTokenizer(br.readLine()," ");

        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int b= Integer.parseInt(br.readLine());

        st=new StringTokenizer(br.readLine()," ");

        StringBuilder sb=new StringBuilder();

        for( int i=0;i<b;i++) {
            if (Arrays.binarySearch(arr,Integer.parseInt( st.nextToken())) >= 0) {
                sb.append("1").append("\n");
            } else
                sb.append("0").append("\n");

        }
        System.out.println(sb);
    }
}
