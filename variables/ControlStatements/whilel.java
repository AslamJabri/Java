package ControlStatements;


public class whilel {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6){
            System.out.println("while Count Value :" +count);
            count++;
        }
        //Similar thing in for loop
        for( count = 1;count!=6;count++){
            System.out.println(" for Count Value:" +count);   
        }
        //similar while but diff approach
        count = 1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Other approach: " + count);
            count++;
        }
        //always check the starting count as do while always executes atleast once.
        count = 1;
        do{
            System.out.println("This is do " + count);
            count++;
        }while(count!=6);


        //challenge time
               
        int number = 4;
        int finish = 20;
        int evnFound = 0;
        
        while(number <= finish){
            number++;
            if(!isEvenNumber(number)){
                continue;  
                //continue dosent process the remaining code in the code block
            }
            evnFound++;
            System.out.println("Even Number : " + number);
            
            if(evnFound >= 5){
                break;
            }

        }
        System.out.println("Total Number of Evn Number found: "+evnFound);
    }
    public static boolean isEvenNumber(int n){
           if(n%2 == 0){
               return true;
           }
           return false;
    }
}
