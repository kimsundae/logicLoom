package coddingProblem.backjoon.nowSolving;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int top = Integer.parseInt(br.readLine());

        switch (top){
            case 1:
                System.out.println(2);
                break;
            case 2:
                System.out.println(4);
                break;
            case 3:
                System.out.println(8);
                break;
            case 4:
                System.out.println(16);
                break;
            case 5:
                System.out.println(32);
                break;
        }
    }
}