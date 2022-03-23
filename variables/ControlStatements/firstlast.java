package ControlStatements;

public class firstlast {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1221));
    }   
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int sum=0,r,ld,fd,s;
        ld = number%10;
        
        while(number>0){
            r = number%10;
            sum=sum*10+r;
            number =number/10;
        }
        fd = sum % 10;
        s = fd+ld;
        return(s);
    }
}
