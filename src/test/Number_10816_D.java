package solution;
//원소를 인덱스로 생각하고 숫자의 개수를 카운트 (!=이분탐색)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_10816_D {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[20000001];

        int a= Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        for(int i=0;i<a;i++){
            count[Integer.parseInt(st.nextToken())+10000000]++;             //해당 인덱스 값 증가
        }

        int b=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        st=new StringTokenizer(br.readLine()," ");

        for(int i=0;i<b;i++){
            sb.append(count[Integer.parseInt(st.nextToken())+10000000]).append(" ");
        }

        System.out.println(sb);
    }

}
