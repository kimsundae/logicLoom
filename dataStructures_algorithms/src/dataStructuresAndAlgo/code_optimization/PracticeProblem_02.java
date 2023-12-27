package dataStructuresAndAlgo.code_optimization;

import java.util.*;

/*
* 518p 연습 문제 2번
*   O(N)에 실행되도록 0부터 N까지 빠진 정수 반환하는 메서드 만들기
* */
public class PracticeProblem_02 {

    public int solve( int[] arr ){
        // 추가 공간 O(logN)
        Arrays.sort(arr);
        // 효율성 O(N)
        for( int i = 0; i < arr.length; i++ ){
            if( arr[i] != i )
                return i;
        }
        return -1;
    }
}
