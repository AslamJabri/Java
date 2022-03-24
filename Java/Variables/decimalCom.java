public class decimalCom {
    public static void main(String[] args) {
        boolean res =areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(res);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1 , double num2){
        num1 = (int) num1 * 1000;
        num2 = (int) num2 * 1000;

        if (num1 != num2){
            return false;
        }
        return true;
    }
}
