import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 1. 배열에서 가장 큰 수 구함 -> 배열 정렬(x) -> max함수 사용하여 업데이트
        // 2. 배열 순회하면서 extra 더함 -> 구했던 큰 수와 비교해서 작다면 false

        // Arrays.sort(candies); // 배열 정렬하면 추후 원래 순서대로 t,f 못함..

        // max함수 이용하여 최대값 업데이트
        int maxCandy = 0;
        for(int i=0; i<candies.length; i++){
            maxCandy = Math.max(maxCandy, candies[i]);
        }

        // boolean[] bCandies = new boolean[candies.length]; // 반환을 배열이 아닌 List로 해야해서 사용불가
        // List로 반환하기 위해 ArrayList생성
        // List : 인터페이스, ArrayList : 구현체 -> Boolean값을 저장할 수 있는 List를 / 배열 기반으로 구현
        List<Boolean> result = new ArrayList<>();

        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies>=maxCandy){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}