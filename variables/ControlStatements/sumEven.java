package ControlStatements;

import java.util.Scanner;

public class sumEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int yearOfbirth = scanner.nextInt();
        int age = 2022 - yearOfbirth;
        scanner.nextLine();
        

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is "+ name + ", and your  "+ age + " years old.");
        scanner.close();


        System.out.println(getEvenDigitSum(122334));
        System.out.println(hasSharedDigit(22, 23));
    }
    public static int getEvenDigitSum(int n){
        if(n <= 0){
            return -1;
        }
        int sum = 0;
        int ld = 0;
        while (n!=0){
            ld = n%10;
            if(ld % 2 ==0){
                sum += ld;
            }
            n = n/10;
        }
        return sum;
    }
    public static boolean hasSharedDigit(int fn,int sn){
        if((fn <10 || fn > 99)&&(sn <10 && sn > 99)){
            return false;
        }
        int r1,r2,r3,r4;
        r1 = fn%10;
        r2 = sn%10;
        r3 = fn/10;
        r4 = sn/10;
        if(r1 == r2 || r3 == r4){
            return true;
        }
        return false;
    }
    
}
