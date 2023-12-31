package coddingProblem.backjoon.categoryProblem.stack_queue_deque;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* https://www.acmicpc.net/problem/10773 제로
* */
public class Stack_10773 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] stack = new int[k];
        int count = -1;
        int sum = 0;
        while( k-- > 0 ){

            int num = Integer.parseInt(br.readLine());

            if( num != 0 ){
                stack[++count] = num;
                sum += num;
            }
            else{
                sum -= stack[count--];
            }

        }
        System.out.println(sum);
    }
}