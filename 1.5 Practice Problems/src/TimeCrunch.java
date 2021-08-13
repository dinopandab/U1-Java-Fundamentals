public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.
    Example:
     */

    public static void main(String[] args) {

        int startingTime  = 2436  ;
        int hour = 3600;
        int minute = 60 ;
        int seconds = 1 ;

        int numHours = startingTime / hour;
        startingTime = startingTime % hour;

        int numMinute = startingTime/ minute;
        startingTime = startingTime % minute ;

        int numSeconds = startingTime / seconds;
        startingTime= startingTime % seconds;



        System.out.println( "The number of hours: " + numHours);
        System.out.println("The number of hours: " + numMinute);
        System.out.println("The number of hours: " + numSeconds);


    }


}
