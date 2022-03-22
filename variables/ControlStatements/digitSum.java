package ControlStatements;

public class digitSum {
    public static void main(String[] args) {
        System.out.println(sumDigit(135));
    }
    private static int sumDigit(int number){
        int sum = 0;
        if(number < 10){
            return -1;
        }
        while ( number > 0){
            int digit  = number % 10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }
}
