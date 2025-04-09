import java.util.*;

class Solution {
    public String reverseWords(String s) {
        // 공백기준으로 나눈 단어를 역순으로 바꾸기
        /*
        공백 기준으로 단어 나누기 -> split
        출력할 StringBuilder 생성
        split은 공백 기준으로 나누어지되 연속한 공백이면 공백도 포함됨.. => ★연속된 공백일땐 split("\\s+")
        나눠서 String 배열에 담음
        배열에 있는 것 역순으로 StringBuilder에 담아서 출력 => 역순for문
        */

        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){ // 역순for문
            sb.append(words[i]).append(" ");
        }

        // StringBuilder -> String => toString()
        return sb.toString().trim(); // 마지막 공백 trim()으로 제거
    }
}