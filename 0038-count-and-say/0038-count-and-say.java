class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for(int k = 1; k < n; k++){

            StringBuilder result = new StringBuilder();

            int count = 1;

            for(int i = 0; i < s.length();i++){

            if(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)){

                count++;

            }else{
                result.append(count);
                result.append(s.charAt(i));
                count = 1;
            }

        }
        s = result.toString();

        
    }
    return s;
}
}