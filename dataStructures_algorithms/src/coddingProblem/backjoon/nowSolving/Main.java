package coddingProblem.backjoon.nowSolving;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] names;
        Set<String> nameSet = new HashSet<>();
        nameSet.add("ChongChong");
        int N = Integer.parseInt(br.readLine());
        int count = 1;

        while( N-- > 0 ){

            names = br.readLine().split(" ");

            if( nameSet.contains(names[0]) && !nameSet.contains(names[1]) ) {
                nameSet.add(names[1]);
                count++;
            }
            else if( !nameSet.contains(names[0]) && nameSet.contains(names[1]) ) {
                nameSet.add(names[0]);
                count++;
            }

        }
        System.out.println(count);
    }
}