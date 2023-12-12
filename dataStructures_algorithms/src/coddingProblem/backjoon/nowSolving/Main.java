package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static boolean isPrime( int M ){
		if( M == 1 ) return false;
		for( int i = 2; i * i <= M; i++ ){
			if( M % i == 0 )
				return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());

		while( N+1 > M ){

			if( isPrime(M) )
				sb.append(M).append("\n");

			M++;
		}

		System.out.println(sb);
	}
}
