package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//BufferedReader를 이용한 이분탐색
public class Number_10816 {
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());
        arr = new int[a];

        StringTokenizer st =new StringTokenizer(br.readLine()," ");

        for(int i =0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int b=Integer.parseInt(br.readLine());

        st=new StringTokenizer(br.readLine()," ");
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<b;i++) {
            int key=Integer.parseInt(st.nextToken());
            sb.append((hibound(key)-lowbound(key))).append(" ");
        }

        System.out.println(sb);

    }

    public static int lowbound(int key){
        int low=0;
        int hi=arr.length;
        while(low<hi){
            int mid=(low+hi) /2;
            if(key<=arr[mid]){
                hi=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static int hibound(int key) {
        int low = 0;
        int hi = arr.length ;

        while (low < hi) {
            int mid = (low + hi) / 2;
            if (key<arr[mid]){
                hi=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

}
