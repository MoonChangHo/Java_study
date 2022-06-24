package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number_10816_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();


        for(int i=0;i<a;i++) {
            int key=Integer.parseInt(st.nextToken());

            hashMap.put(key,hashMap.getOrDefault(key,0)+1);

        }

        int b=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine()," ");
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<b;i++){
            int key=Integer.parseInt(st.nextToken());
            sb.append(hashMap.getOrDefault(key,0)).append(" ");
        }
        System.out.println(sb);

    }
}
