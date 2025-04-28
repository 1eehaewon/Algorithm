import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        /*
        차집합 구하기
        1. 중복 제거 -> nums1과 nums2를 Set으로 변환
        - Set<Integer> set = new HashSet<>();
        2. 차집합 : nums1 - nums2, nums2 - nums1
        3. List로 변환 후 결과 묶기
        */

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // nums1을 set1에 추가
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        
        // nums2을 set2에 추가
        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }

        // 차집합 구하기 -> removeAll / contains
        // removeAll
        // Set 복사본 만들기 : removeAll을 사용하면 기존 Set1이 변경됨 -> 추후 Set2와 비교할 때 문제생김
        Set<Integer> onlyInNums1 = new HashSet<>(set1);
        Set<Integer> onlyInNums2 = new HashSet<>(set2);

        // 겹치는 부분 제거
        onlyInNums1.removeAll(set2);
        onlyInNums2.removeAll(set1); 

        // List형태로 변경
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(onlyInNums1));
        answer.add(new ArrayList<>(onlyInNums2));

        return answer;

    }
}