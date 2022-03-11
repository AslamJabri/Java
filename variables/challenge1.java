public class challenge1 {
    public static void main(String[] args){
        byte myByteNumber = 125;
        short myshortNumber = 1025;
        int myintNumber = 120015;
        long myLongNumber = 50000 + (myByteNumber*10) + myshortNumber+ myintNumber;
        System.out.println("The long Number: "+ myLongNumber);
    }
}
