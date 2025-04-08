import java.util.*;

class Solution {
    public String reverseVowels(String s) {

        /*
        1. 모든 모음 문자를 포함하는 변수 vowels 만들기
        2. 받는 문자열s를 char 배열로 바꾸기 -> 문자 하나하나 비교하기 위함
        3. s를 돌면서 vowels에 있는 문자와 같은 문자(모음)가 있다면 -> 스택에 추가(push)
            -> indexOf() 방식, Set.contains() 방식
        4. s에서 모음이 있다면 -> 스택에서 꺼냄(pop)
        */

        String vowels = "aeiouAEIOU";
        Stack<Character> vowelsStack = new Stack<>();

        char[] arr = s.toCharArray();

        // 모음만 스택에 넣기
        for(int i=0; i<arr.length; i++){
            // vowels.indexOf(arr[i])가 모음이라면 vowels의 인덱스 반환, 모음이 아니라면 -1 
            if(vowels.indexOf(arr[i]) != -1){ // -1이 아니라면 인덱스가 반환된것 = 모음
                vowelsStack.push(arr[i]);
            }
        }

        // 모음만 스택에서 빼기
        for(int i=0; i<arr.length; i++){
            // arr[i]가 모음이라면 스택에 있던 것을 빼서 넣기(뒤집는 과정)
            if(vowels.indexOf(arr[i]) != -1){
                arr[i] = vowelsStack.pop();
            }
        }

        // char배열을 String으로 반환하는 방법 - String은 char[]을 인자로 받는 생성자를 가지고 있음.
        return new String(arr);
        
    }
}
