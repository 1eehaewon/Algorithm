class Solution {
    public String mergeAlternately(String word1, String word2) {
        // 문자 추가 => StringBuilder
        StringBuilder merged = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);

        // 문자 번갈아가면서 추가(더 짧은 문자 길이까지만)
        // 길이 같은 경우는 여기서 해결됨.
        for(int i=0; i<minLen; i++){
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
            }

        // 남은 문자 추가
        if(len1 > len2){
            merged.append(word1.substring(minLen));
        } else if(len1 < len2){
            merged.append(word2.substring(minLen));
        }

        return merged.toString();
    }
}