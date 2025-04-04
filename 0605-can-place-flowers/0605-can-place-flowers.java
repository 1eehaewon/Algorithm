class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 인접하지 않게 심을 수 있는 구역 개수와 n 비교
        int cnt = 0;

        // 1. 인접하지 않게 심을 수 있는 구역 개수 구하기
        /*
        배열의 현재 위치[i]에서 [i-1], [i+1]이 0이어야함
        -> 왼쪽과 오른쪽이 0인지 확인 (경계처리)
        그렇다면 [i]를 1로 업데이트 후 개수++
        */
        
        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i]==0){ // i번째가 비어있을 때
                // 경계처리
                // 맨처음이거나 왼쪽(i-1) 비어있을 때
                boolean leftEmpty = (i==0 || flowerbed[i-1]==0);
                // 맨끝이거나 오른쪽(i+1) 비어있을 때
                boolean rightEmpty = (i==flowerbed.length-1 || flowerbed[i+1]==0);

                // 둘다 만족하는 i번째에 심기
                 if(leftEmpty && rightEmpty){
                    flowerbed[i] = 1; // 꽃 심기
                    cnt++;
                }
            } 
        }
        
        if(cnt>=n){
            return true;
        } else {
            return false;
        }
        
        /* 오답
        for(int i=0; i<flowerbed.length; i++){
            if(i==0){ -> 배열길이가 1인경우 i+1은 존재하지 x
                if(flowerbed[i]!=1 && flowerbed[i+1]!=1){
                    flowerbed[i] = 1;
                    cnt++;
                    
                }
            }
            if(i>0 && i<flowerbed.length-1){
                if(flowerbed[i]!=1 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                    flowerbed[i] = 1;
                    cnt++;
                    
                }
            }
            if(i==flowerbed.length-1){
                if(flowerbed[i] != 1 && flowerbed[i-1] != 1){
                    flowerbed[i] = 1;
                    cnt++;
                    
                }
            }
        }

        n은 심는 개수 이므로 cnt보다 작아도 심을 수 있기에 true
        => cnt >= n -> true
        if(cnt != n){
            return false;
        } else {
            return true;
        }
        */
        
    }
}