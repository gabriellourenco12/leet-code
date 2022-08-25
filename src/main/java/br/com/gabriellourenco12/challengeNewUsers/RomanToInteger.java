package br.com.gabriellourenco12.challengeNewUsers;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInteger(String s) {
        int result = 0;
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            if (current > last) {
                result += current - 2*last;
            } else {
                result += current;
            }
            last = current;
        }
        return result;
    }

    Map<Character, Integer> map = new HashMap<>();
    {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static void main(String args[])
    {
        RomanToInteger romanToInteger = new RomanToInteger();
        String romanStr= "XXIX";
        System.out.println("Valor convertido para inteiro: " + romanToInteger.romanToInteger(romanStr));
    }
}
