package coddingProblem.backjoon.categoryProblem.backTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* https://www.acmicpc.net/problem/15651 N과 M(3)
* */
public class BackTracking_15651 {
    static int M;
    static int N;
    static int[] arr = new int[10];
    static StringBuilder sb = new StringBuilder();
    public static void solve( int index ){
        if( index == M ){
            for( int i = 0; i < M; i++ )
                sb.append(arr[i]).append(" ");
            sb.append("\n");
            return;
        }
        for( int i = 1; i <= N; i++ ){
                arr[index] = i;
                solve(index+1);
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        solve( 0 );
        System.out.println(sb);
    }
}