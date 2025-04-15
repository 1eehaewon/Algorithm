class Solution {
    public void moveZeroes(int[] nums) {
        // 배열 내에서 순서 그대로 유지한 채, 0만 전부 뒤로 옮기기
        // 추가 배열 생성 없이 in-place방식으로
        /* 
        0이 아닌 지점 포인터 생성
        배열 돌면서 0이 아니라면 nums[포인터]에 nums[i]값 대입 
        -> 포인터는 0부터 시작이기에 숫자가 나오면 nums[0]부터 대입됨
        포인터++
        그 후에 저장된 포인터부터 끝까지 0 대입
        */
        int nonZeroIdx = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[nonZeroIdx] = nums[i];
                nonZeroIdx++;
            }
        }
        // 양수 다 넣은 후에 나머지 인덱스는 0으로
        for(int i=nonZeroIdx; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}