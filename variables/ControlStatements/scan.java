package ControlStatements;

import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        int add =0,i=1,sumadd =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any Number to start:" );
        boolean hasNext = scanner.hasNextInt();
        
        
        
        if(!hasNext){
            System.out.println("Invalid Value");
        }else{
            do{
                scanner.nextLine();
                System.out.println("Enter the number #" + i +":");
                add = scanner.nextInt();
                sumadd += add;
                i++;
            }
            while(i <=10);
            System.out.println("Total Number : " + sumadd);

        }
        scanner.close();
    }
}
