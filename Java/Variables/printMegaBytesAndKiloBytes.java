public class printMegaBytesAndKiloBytes {
    public static void main(String[] args) {
        printMegaBytesAndKiloByte(2500);
    }
    public static void printMegaBytesAndKiloByte(int kilobytes){
        if (kilobytes <= 0){
            System.out.println("Invalid Value");
        }else{
            int mB = kilobytes /1024;
            int kB = kilobytes % 1024;
            System.out.println(kilobytes + "KB = " + mB +" MB "+ kB + " KB ");
        }
    }
}
