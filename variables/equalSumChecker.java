public class equalSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 2, 3));
        System.out.println(hasTeen(13,23,34));
    }
    public static boolean hasEqualSum(int a ,int b , int c){
        int d = a+ b;
        if (d == c){
            return true;
        }
        return false;
    }
    public static boolean hasTeen(int i ,int j ,int k){
        if ((i >=13 && i <= 19)|| (j >=13 && j <= 19)||(k >=13 && k <=19)){
            return true;
        }
        return false;
    }
}
