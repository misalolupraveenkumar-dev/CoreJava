package info.com.general;

public class DecimalComparator {

    public static void main(String[] args) {


        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));// → should return true since numbers are equal up to 3 decimal places.

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); //→ should return false since numbers are not equal up to 3 decimal places

        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); //→ should return true since numbers are equal up to 3 decimal places.

        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));// → should return false since numbers are not equal up to 3 decimal places.

    }

    public  static boolean areEqualByThreeDecimalPlaces(double decimalFirstNumber, double decimalSecondNumber){
        double deciValue1 = decimalFirstNumber * 1000;
        long longVar1 = (long)deciValue1;
        double deciValue2 = decimalSecondNumber * 1000;
        long longVar2 = (long)deciValue2;

        if(longVar1 == longVar2){
            return  true;
        }
        return  false;
    }
}
