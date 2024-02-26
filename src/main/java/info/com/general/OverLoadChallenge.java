package info.com.general;

public class OverLoadChallenge {

    public static void main(String[] args) {

        System.out.println( "Centimeters: "+convertToCentimeters(10) );

        System.out.println( "Centimeters: "+convertToCentimeters(9,8) );

    }


    public  static double convertToCentimeters(int inches){
        return  inches * 2.54;
    }

    public  static double convertToCentimeters(int feet, int inches){

        return  ((feet * 12) + inches) * 2.54;

    }

}
