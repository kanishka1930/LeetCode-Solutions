class Solution {
    public int myAtoi(String s) {

        int sign = 1;
        int i =  0;

        while(i < s.length() && s.charAt(i) == ' '){

            i++;
        }
        if(i == s.length()){
            return 0 ;
        }
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;

        }
        else if(s.charAt(i) == '+'){
            sign = 1;
            i++;
            
        }
        int result = 0;

        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <='9'){

            int digit = s.charAt(i) -'0';

            if(result > Integer.MAX_VALUE /10 || (result == Integer.MAX_VALUE / 10 
            
           && digit > 7 )){

            if(sign == 1){
                return Integer.MAX_VALUE;
            } else{
                return Integer.MIN_VALUE;
            }
           }
           result = result * 10 + digit;

           i++;
        }
        return result * sign;
    }
}