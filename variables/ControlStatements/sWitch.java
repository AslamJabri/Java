package ControlStatements;

public class sWitch {
    public static void main(String[] args) {
        char newChar = 'D';
        switch(newChar){
            case 'A':
                System.out.println("This is A");
                break;
            case 'B':
                System.out.println("This is B");
                break;
            case 'C':case 'D': case 'E':
                System.out.println("This is C , D ,E" + " This is the char value " +newChar + ". ");
                break;
            
            default:
                System.out.println("It is neither A, B , C,D,E");
                break;
                //In the last line we can either use or not use the break statement.
        }
    }
}
