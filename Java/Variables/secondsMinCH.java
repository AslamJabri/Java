public class secondsMinCH {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
        
    
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 5));
        System.out.println(getDurationString(400L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(2345, 46));
    }
    
    public static String getDurationString(long min,long second){
        if ((min < 0) || (second < 0) || (second > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        long hours = min/60;
        long remMin = min % 60;
        String hoursString = hours + "h";

        if (hours < 10){
            hoursString = "0" + hoursString;    
        }

        String minutesString = remMin + "m";
        if (remMin < 10){
            minutesString = "0" + minutesString;    
        }

        String secondString = second + "s";
        if (second < 10){
            secondString = "0" + secondString;    
        }

        return hoursString + " " + minutesString + " " + secondString;
    }
    public static String getDurationString( long second){
        if (second < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long min = second/60;
        long remsec = second % 60;

        return getDurationString(min, remsec);
    }
}

