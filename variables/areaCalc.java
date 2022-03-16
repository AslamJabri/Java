public class areaCalc {
    private static final int negative_value = -1;
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5, 4));
    }
    public static double area(double radius){
        if (radius < 0){
            return negative_value;
        }
        double circleArea =   3.14159 * (radius *radius);
        return circleArea;
    }
    public static double area ( double x , double y){
        if (x < 0 || y < 0){
            return negative_value;
        }
        double rectArea =  x * y;
        return rectArea;
    }

}
