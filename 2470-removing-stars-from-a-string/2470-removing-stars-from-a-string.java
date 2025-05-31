import java.util.*;

class Solution {
    public String removeStars(String s) {
        // *의 개수만큼 *의 왼쪽 문자 제거
        // Stack에 문자 순서대로 넣다가 *을 넣으면 *과 *아래 스택 값 제거
        Stack<Character> stack = new Stack<>();

        // 스택에 문자 넣기
        /* 굳이 *을 넣었다 뺄 필요 없음
        for(int i=0; i<s.length(); i++) {
            stack.push(s.charAt(i));
            if(s.charAt(i) == '*') {
                stack.pop();
                stack.pop();
            }
        }
        */
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '*'){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        // 스택에서 꺼낸 후 역순으로 해야함 -> 다른 스택에 삽입
        Stack<Character> reverse = new Stack<>();
        while(!stack.isEmpty()){
            reverse.push(stack.pop());
        }
        // reverse에서 차례대로 꺼내서 문자열로 만들어야함
        // String result = ""; String은 매번 객체가 생성돼서 성능 저하 이슈
        StringBuilder result = new StringBuilder();
        while(!reverse.isEmpty()){
            // result += reverse.pop();
            result.append(reverse.pop());
        }
        // return result;
        return result.toString();
    }
}