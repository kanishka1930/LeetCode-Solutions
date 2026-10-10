import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        String[] keypad = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        printComb(digits, 0, "", keypad, result);

        return result;
    }

    private void printComb(String digits, int idx, String combination,
                           String[] keypad, List<String> result) {

        if (idx == digits.length()) {
            result.add(combination);
            return;
        }

        char currChar = digits.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(digits, idx + 1, combination + mapping.charAt(i),keypad,result );
        }
    }
}



        
    
