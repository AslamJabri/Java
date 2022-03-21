package ControlStatements;



public class sumodd {
    public static void main(String[] args) {
       // System.out.println(isOdd(10));
        System.out.println(sumOdd(1,10));
    }
    public static boolean isOdd(int a){
        return ((a>0) && (a%2!=0));
    }
    public static int sumOdd(int start , int end){
        int sum = 0;
        if((end < start) || (start < 0) || end < 0 ){
            return -1;
        }
        if(!isOdd(start)){
            start++;
        }
        for(int i = start ; i <= end ; i ++ ){
            sum += i;
        }
        return sum;
    } 
}

