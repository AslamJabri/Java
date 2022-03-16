public class methodOverloading {
    public static void main(String[] args) {
        calcFeetandInchesToCent(1,4);
        calcFeetandInchesToCent(157);
    }
    public static double calcFeetandInchesToCent(double feet , double inches){
        if ((feet >= 0) && (inches >= 0 && inches <=12)){
            double inc = inches * 0.08333; 
            double feets = feet + inc;
            float conv = (float)(feets * 30.48);
            System.out.println(feet + " feet "+ inches + " Inches" + " = "+conv + " cm");
        }else{
            System.out.println("Invalid feet or Inches");
        }
        return -1;
    }
    public static double calcFeetandInchesToCent(double inches){
        if (inches >= 0 ){
            double feet = (int) inches/12;
            double remInche = (int) inches%12;
            System.out.println("The conversion of "+ inches +" into feet is "+ feet + " ft" +" and the remaining inches is "+ remInche);
            return calcFeetandInchesToCent(feet, remInche);
        }
        return -1;
    }
}
//This is method overloading where we are using same method name but different parameters. 
