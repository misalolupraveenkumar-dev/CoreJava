package info.com.general;

public class SpeedConverter {

    public static void main(String[] args) {

//        long milesPerHour = toMilesPerHour(-2.0);

        printConversion(2);
//        System.out.println("miles per hour: "+milesPerHour);

    }



//    public static long toMilesPerHour(double kilometerPerHour){
//
//        if(kilometerPerHour < 0){
//            return -1;
//        }
//        printConversion(kilometerPerHour);
//        double milesPerHour =  kilometerPerHour * 0.621371;
//
//        return Math.round(milesPerHour);
//    }

//     public static void printConversion(double kilometerPerHour){
//
//         if(kilometerPerHour < 0){
//             System.out.println("Invalid Value");
//         }
//
//         else{
//             double milesPerHour = kilometerPerHour / 1.609d;
//             System.out.println("mi => "+milesPerHour);
//             long round = Math.round(milesPerHour);
//             System.out.println("round off  => "+round);
//             System.out.println(kilometerPerHour+" km/h = " + round + " mi/h");
//         }
//     }




    public static long toMilesPerHour(double kilometerPerHour){

        if(kilometerPerHour < 0){
            return -1;
        }

        double milesPerHour =  (double)kilometerPerHour / 1.609;

        return Math.round(milesPerHour);
    }


    public static void printConversion(double kilometerPerHour){

        if(kilometerPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }

        else{

            int milesPerHour = (int)toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
