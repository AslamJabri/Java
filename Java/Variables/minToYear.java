public class minToYear {
     
    public static void main(String[] args) {
            printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0 ){
            System.out.println("Invalid Value");
        }
        long year = minutes / 525600;
        long remDays = (minutes / 60 / 24) % 365 ;
        System.out.println(year + " year and " + remDays + " Days." );
    }
}

