public class conversion {
    public static void main(String[] args){
        //WE CAN IMPICITELY CONVERT FROM INTEGER TO DOUBLE BECAUSE A DOUBLE IS LARGER THAN AN INTEGER
        int number1 = 5;
        double number2 = number1;
        System.out.println("INTEGER = "+number1);
        System.out.println("DOUBLE = "+number2);

        //HOWEVER WE CANNOT CONVERT FROM double to int implicitely BUT WE CAN DO THIS EXPLICITELY

        double value1 = 4.341;
        int value2 = (int)value1;
        System.out.println(value2);
    }
}
