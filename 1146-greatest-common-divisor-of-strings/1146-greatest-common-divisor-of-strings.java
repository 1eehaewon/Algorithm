class Solution {
    public String gcdOfStrings(String str1, String str2) {
        /*
        문자열 최대공약수
        1. 문자열 서로 순서가 다르게 합쳤을 때, 결과가 같으면 패턴이 일치 -> 최대공약수 존재
        2. 각 문자열 길이의 최대공약수만큼 문자열을 자르면 -> 문자열 최대공약수 
        */

        // 문자열 서로 같음 확인 -> equals
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int lenGcd = gcd(str1.length(), str2.length());
        return str1.substring(0, lenGcd);
    }

    // 문자열 길이의 최대공약수
    // 유클리드 호제법
    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}