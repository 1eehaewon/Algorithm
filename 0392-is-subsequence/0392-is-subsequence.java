class Solution {
    public boolean isSubsequence(String s, String t) {
        /*
        문자열 s의 각 문자가 문자열 t에 순서대로 존재하는지?
        -> s와 t를 앞에서부터 한 문자씩 비교
        -> s의 모든 문자를 t안에서 순서대로 찾을 수 있는지 확인
        투포인터 방식
        s와 t의 인덱스 변수 초기화
        s[i] == t[j] => i++ (s의 다음문자를 찾기위해 i++)
        항상 j++
        최종적으로 i가 s.length()와 같다면 s의 문자를 t에서 다 찾은것 => true
        */

        int i = 0;
        int j = 0;

        for(j=0; j<t.length(); j++){
            if(s.length()>i){ // i가 s.length()와 같아지면 IndexOutOfBoundsException
                if(s.charAt(i) == t.charAt(j)){ // s가 ""로 주어지면 IndexOfBOunds
                i++;
                }
            }
        }
        /*
         while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        */

        if(i==s.length()){
            return true;
        } else{
            return false;
        }
    }
}