public class secondsMinCH {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(400L));
    }
    
    public static String getDurationString(long min,long second){
        if ((min < 0) || (second < 0) || (second > 59)){
            return "Invalid Value";
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
            return "Invalid Value";
        }
        long min = second/60;
        long remsec = second % 60;

        return getDurationString(min, remsec);
    }
}

