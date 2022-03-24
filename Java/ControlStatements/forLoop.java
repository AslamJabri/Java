package ControlStatements;

public class forLoop {
    public static void main(String[] args) {
        for (double i = 2; i < 9; i++){
            System.out.println("10000 at " + i +"% intrest = " + String.format("%.2f",calculateIntrest(10000.0, i)));
        }
        System.out.println("************");
        for (double i = 8; i > 1; i--){
            System.out.println("10000 at " + i +"% intrest = " + String.format("%.2f",calculateIntrest(10000.0, i)));
           
        }
        int even = 100;
        for (int i = 0; i <= even ; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
          
        }
    }
    public static double calculateIntrest(double amount , double intrest){
        return (amount *( intrest/100));
    }
    
}
