import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // 배열 중 숫자의 개수가 각각 다르면 true
        // HashMap -> key, value -> key = 배열 숫자, value = 숫자의 개수
        Map<Integer, Integer> map = new HashMap<>();

        // 배열의 각 숫자의 개수 - (1,3) (2,2) (3,1)
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // Map길이만큼 돌면서 각 value 비교 (3) (2) (1)
        // -> Set에 value를 넣었을 때, 길이가 줄어들면 중복이 존재
        // map.values() : map의 value값들을 Collection으로 반환 -> [3,2,1]
        Set<Integer> set = new HashSet<>(map.values());
        if(map.size() != set.size()) {
            return false;
        }
        return true;
    }
}