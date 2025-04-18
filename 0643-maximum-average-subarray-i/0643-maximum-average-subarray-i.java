class Solution {
    public double findMaxAverage(int[] nums, int k) {
        /*
        길이가 k인 연속된 부분 배열 중 최대 평균값
        a[i]+a[i+1]+a[i+2]...a[i+k-1] / k 가 최대의 경우가 나와야함
        연속된 부분 배열 -> 슬라이딩 윈도우
        a[i]+a[i+1]+a[i+2]+a[i+3] / 4
        -> a[i+1]+a[i+2]+a[i+3]+a[i+4] / 4
        -> a[i+2]+...+a[i+5] / 4
        i+k-1 < nums.length 까지 반복
        합 변수 설정 후 max로 계속 업데이트
        */
        double sum = 0; // 초기 합

        // 초기 윈도우 합
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double max = sum; // 최대 합(초기 sum값 저장해야함)

        // 초기 윈도우 합에서 첫번째 항목(nums[i-k]) 빼고 k번째(nums[k]) 항목 더함
        for(int i=k; i<nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }

        return max / k;

    }
}