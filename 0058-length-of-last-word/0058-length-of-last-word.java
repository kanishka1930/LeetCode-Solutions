class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length()- 1;

        //step 1- skip trailing spaces

        while (i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        // step 2- count the last word

        int count = 0;

        while (i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
        
    }
}