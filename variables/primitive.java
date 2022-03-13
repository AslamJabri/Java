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

        float myfloatMinValue = Float.MIN_VALUE;
        float myfloatMaxValue = Float.MAX_VALUE;
        System.out.println("Min float Value : " + myfloatMinValue);
        System.out.println("Max float Value: " + myfloatMaxValue);

        double mydoubleMinValue = Double.MIN_VALUE;
        double mydoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Min Double Value : " + mydoubleMinValue);
        System.out.println("Max Double Value: " + mydoubleMaxValue);

        int intValue = 5/3;
        float fValue = 5f/3f;//casting and can also be used 5.25f
        double dValue = 5d/3d;
        System.out.println("Int Value: "+ intValue +"\n" + "fvalue: " + fValue +"\n"+ "dvalue: "+ dValue);
        
        char myChar = 'D';
        char myUnicode = '\u00A9';
        System.out.println("Char: "+ myChar );
        System.out.println("Unicode: "+ myUnicode);

        //not a primitive but mostly used
        String myString = "This is a new String.";
        myString = myString + " This is also a new string";
        System.out.println(myString);
        String myNum = "10";
        int myInt = 15;
        System.out.println("The output of int and string: "+ myNum + myInt);


        boolean isALien = false;
        if (isALien == false){
	    System.out.println("It is not alien");
        System.out.println("True it is not an Alien");
        }

        int myfNum = 30;
        int mysNum = 50;
        if (myfNum > 100){
            System.out.println("This is greater than 100");
        }
        if (myfNum < 50){
            System.out.println("This is less than 50");
        }
        if ((myfNum >=30) && (mysNum <= 50)){
            System.out.println("Both conditions should be true");
        }
        if ((myfNum <=30) || (mysNum <= 50)){
            System.out.println("Either one  conditions should be true");
        }

        boolean myCar = true;
        if (myCar){
            System.out.println("This is short hand notation for mycar == true");
        }
        if (!myCar){
            System.out.println("This is not operator and short hand notation");
        }
        int ageOfClient = 20;
        boolean isEighteenOver = (ageOfClient == 20) ? true : false;
        System.out.println(isEighteenOver);

        int gameScore = 0;
        boolean gameOver = true;
        int levelup = 5;
        int bonus = 850;

        if ((gameScore >= 5000) && (gameOver)){
            System.out.println("The final Score: " + gameScore*bonus + " You are level "+ levelup++);
        }else if ((gameScore < 4900 && gameScore > 4000) && (gameOver)){
            System.out.println("Your score is " + gameScore );
        }else{
            System.out.println("Game Over");
        }
    }
}

