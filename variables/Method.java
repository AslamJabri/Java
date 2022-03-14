public class Method {
    public static void main(String[] args) {
        //calling the method
        calculateScore(true,800,5,100);
        double grocery = groceryItems(20, 259,0.6);
        System.out.println("Total grocery : " + grocery);
    }
    //because of void we are not returning any value if we want to return the value remove void and put data type
    public static void calculateScore(boolean gameOver , int score,int levelCompleted , int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 1000;
            System.out.println("The final Score : " + finalScore);
        }
    }
//here we are returning the value so we have used a data type float.
    public static float groceryItems(int item1 , int item2 , double gst){
        float totalItems =  item1 + item2;
        totalItems *=gst;
        return totalItems;
    }
}
