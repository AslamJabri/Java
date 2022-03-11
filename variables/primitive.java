public class primitive {
    public static void main(String[] args){
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Min value: "+myMinValue);
        System.out.println("Max value: "+myMaxValue);
        System.out.println("Busted  Max Integer: " + (myMaxValue+1));
        System.out.println("Busted Min Integer: " + (myMinValue-1));

        byte myMinbyteValue = Byte.MIN_VALUE;
        byte myMaxbyteValue = Byte.MAX_VALUE;
        System.out.println("My Byte min  Value: " + myMinbyteValue);
        System.out.println(("Max Byte Value: " + myMaxbyteValue));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Short min  Value: " + myMinShortValue);
        System.out.println(("Max Short Value: " + myMaxShortValue));

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Min Long Value : " + myLongMinValue);
        System.out.println("Max Long Value: " + myLongMaxValue);
    }
}

