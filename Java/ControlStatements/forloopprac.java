package ControlStatements;

public class forloopprac {
    public static void main(String[] args) {
        //addition
        for(int i = 0 ; i <=10;i++){
            int j = i+i;
            System.out.println(j);
        }
        //multiplication 
        int cons = 4;
        for (int j = 1; j <=10;j++){
            int m = cons*j;
            System.out.println(cons + "*" + j + "=" + m );
        }
        int fac = 5;
        for(int a = 1; a <= fac ; a++){
           fac*=a;
           System.out.println(fac);
        }
        int count = 10;
        for (int z = 1;z <= count; z++ ){
            if(z%2 ==0){
                System.out.println( z+" is even " );
            }else{
                System.out.println(z+ " is odd " );
            }
        }
        int fHcf = 20;
        int sHcf = 30;
        for( int h = 1;h<=fHcf ; h++){
            if(fHcf%h == 0){
                System.out.println(h);
            }
        } 
        for( int s = 1;s<=sHcf ; s++){
            if(sHcf%s == 0){
                System.out.println(s);
            }
        }
        

    }
}
