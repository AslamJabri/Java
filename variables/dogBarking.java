public class dogBarking {
    public static void main(String[] args) {
        boolean res = shouldWakeUp(true, -1);
        System.out.println(res);
    }
    public static boolean shouldWakeUp(boolean barking , int hourOfTheDay){
        if (hourOfTheDay < 0 || hourOfTheDay > 23){
            return false;
        }
        if((barking == true) && (hourOfTheDay <8 || hourOfTheDay > 23)){
            return true;
        }
        return false;
    }
}
