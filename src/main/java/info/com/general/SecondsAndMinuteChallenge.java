package info.com.general;

public class SecondsAndMinuteChallenge {

    public static void main(String[] args) {

        System.out.println("Hours : "+ getDurationString(3666));

    }

    public  static String getDurationString(int seconds){
        int minutes = 0;
        if(seconds >= 60){
            minutes = seconds/60;
            seconds = seconds % 60;
        }
        return  getDurationString( minutes, seconds);
    }

    public  static String getDurationString(int minutes, int seconds){

        String secondsAndMinutes = "";

        int hours = 0;

        if (minutes >= 60){

            hours = minutes/60;
            minutes = minutes % 60;
            secondsAndMinutes  = hours+"h "+minutes+"m "+seconds+"s";

        }else {
            System.out.println("invalid minutes passed");
        }
    return  secondsAndMinutes;
    }

}
