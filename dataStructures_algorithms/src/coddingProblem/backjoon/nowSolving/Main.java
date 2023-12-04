package coddingProblem.backjoon.nowSolving;


import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer( br.readLine(), " " );
		int N = Integer.parseInt( st.nextToken() );
		int M = Integer.parseInt( st.nextToken() );

		Map<String,Integer> names = new HashMap<>();
		String[] numbers = new String[N+1];
		for( int i = 1; i <= N; i++ ){
			String pocketmon = br.readLine();
			names.put( pocketmon, i );
			numbers[i] = pocketmon;
		}

		for( int i = 0; i < M; i++ ){
			String pocketmon = br.readLine();
			if( '9' >= pocketmon.charAt(0)  )
				sb.append(numbers[Integer.parseInt(pocketmon)]).append("\n");
			else
				sb.append(names.get(pocketmon)).append("\n");
		}

		System.out.println(sb);

	}
}
