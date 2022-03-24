package ControlStatements;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(454));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12321));

        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int number){
        int r,sum =0,temp;
        temp = number;
        while(number != 0){
            r = number%10;
            sum = (sum*10) +r;
            number/=10;
        }
        if(temp == sum){
            return true;
        }
        return false;
    }
}
