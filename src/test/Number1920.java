package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1920 {
    public static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());

        arr = new int[k];

        StringTokenizer st= new StringTokenizer(br.readLine()," ");

        for(int i=0;i<k;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);


        int t=Integer.parseInt(br.readLine());

        st=new StringTokenizer(br.readLine()," ");

       //System.out.println(Arrays.toString(arr));

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<t;i++) {
            if(binarySearch(Integer.parseInt(st.nextToken()))>=0){
                sb.append("1\n");
            }
            else
                sb.append("0\n");
        }
        System.out.println(sb);


    }
    public static int binarySearch(int key){
        int lo=0;
        int hi=arr.length-1;

        while(lo<=hi){
            int mid= (lo+hi)/2;
            if(key>arr[mid]){
                lo=mid+1;
            }
            else if(key<arr[mid]){
                hi=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

