public class L6{
    public static void main(String[] args){
        int value1 = 4;
        double value2 = 1.2;

        int powerScore1;
        double powerScore2, squareRoot1;

       // The one under this is an error on purpose
      //  powerScore1 = Math.pow(value1, value2); //throws an error


        powerScore2 = Math.pow(value1, value2); //returns 5.278031643091577

        squareRoot1 = Math.sqrt(value2); //returns 1.0954451150103321

        System.out.println(powerScore2);
        System.out.println(squareRoot1);


        // Never use 3.14 ... its inaccurate. Instead use :
        System.out.println(Math.PI);

        //Math.max(double a, double b ) = returns the highest of the two values as their data types
        //Math.min(double a, double b ) = returns the lowest of the two values as their data types

        int num1 = 2;
        int num2 = 14;
        int num3 = 10;

        //style 1
        int max = Math.max(num1, num2);
        max = Math.max(max, num3);

        int min = Math.max(num1, num2);
        min = Math.min(min, num3);

        //style2
        int max2 = Math.max(Math.max(num1, num2), num3);
        int min2 = Math.min(Math.min(num1, num2), num3);

        System.out.println(max2 + " , " + min2);




    }
}
