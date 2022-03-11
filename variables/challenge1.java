public class challenge1 {
    public static void main(String[] args){
        byte myByteNumber = 125;
        short myshortNumber = 1025;
        int myintNumber = 120015;
        long myLongNumber = 500000L  +10L *(myByteNumber + myshortNumber+ myintNumber);
        System.out.println("The long Number: "+ myLongNumber);


        //challenge2

        double pound = 200d;
        double  kg = 0.45359237d;
        double total = pound * kg;
        System.out.println("Total kilograms: "+total);
    }
}
