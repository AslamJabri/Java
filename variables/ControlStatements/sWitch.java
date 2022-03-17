package ControlStatements;

public class sWitch {
    public static void main(String[] args) {
        char newChar = 'A';
        switch(newChar){
            case 'A':
                System.out.println("This is A");
                break;
            case 'B':
                System.out.println("This is B");
                break;
            case 'C':
                System.out.println("This is C");
                break;
            case 'D':
                System.out.println("This is D");
                break;
                //using a break statement helps in breaking the flow when the condition is meet.
            case 'E':
                System.out.println("This is E");
                break;
            default:
                System.out.println("It is neither A, B , C,D,E");
                break;
                //In the last line we can either use or not use the break statement.
        }
    }
}
