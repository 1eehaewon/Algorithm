class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        nums에 있는 전체 숫자를 곱하는데
        nums[i] 빼고 곱한 결과(answer)가 나와야함
        answer[i] = nums[i] 뺀 나머지 nums 곱
        -> answer[0] = nums[1] * nums[2] ...
        => 그렇다면 nums에서 i번째를 기준으로 좌/우로 놔눈다!
        -> 그리고 i번째 이전까지 곱(좌) * i번째 후부터 곱(우)
        공간최적화 => 왼쪽 누적곱 * 오른쪽 누적곱 (알고리즘)
        */
        
        int left = 1;
        int right = 1;
        int[] answer = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            answer[i] = left; // 첫번째 값은 left가 없기에 기본값 1
            left = left * nums[i];
        }
        
        // 뒤에서부터 곱해줌
        for(int i=nums.length-1; i>=0; i--){
            answer[i] *= right;
            right *= nums[i];
        }
        
        return answer;

        /* 나누기를 쓰지마라하는 이유
        for(int i=0; i<nums.length; i++){
            int x = 1;
            x *= nums[i]; // 전체곱
        }
        for(int i=0; i<nums.length; i++){
            answer[i] = x / nums[i];
        }
        => nums에 0이 있으면 예외처리 코드 복잡
        */

    }
}