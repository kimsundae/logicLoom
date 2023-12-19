package coddingProblem.backjoon.nowSolving;


import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int nowIndex = -1;

        while( T-- > 0 ){

            String PS = br.readLine();
            for( int i = 0; i < PS.length(); i++ ){

                if('(' == PS.charAt(i)){
                    nowIndex++;
                    if( nowIndex == -1 ) {nowIndex--; break;}
                }
                else
                    nowIndex--;

            }

            if( nowIndex == -1 )
                sb.append("YES").append("\n");
            else
                sb.append("NO").append("\n");

            nowIndex = -1;
        }
        System.out.println(sb);
    }
}