public class leapCalculator {
    public static void main(String[] args) {
       boolean leap =  isLeapYear(2400);
       if (leap == true){
           System.out.println("The Year is a Leap year " );
       }else{
           System.out.println("Not a Leap Year");
       }
    }
    public static boolean isLeapYear (int year){
        if (year >= 1 && year <= 9999){
            if(year%4 == 0){
                if(year%100 == 0){
                    if(year%400 ==0){
                        return true;
                    }
                }
            }
        }
        return false;


        
    }


    
}
