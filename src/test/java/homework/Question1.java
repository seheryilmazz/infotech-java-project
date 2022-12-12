package homework;

public class Question1 {
    public static void main(String[] args) {

        //1-Primitive Data Turleri ve Variable'lar

        boolean isFunny=false, isEasy=true, isDiffucult=true;
        System.out.println("isFunny : "+isFunny);
        System.out.println("isEasy : "+isEasy);
        System.out.println("isDiffucult : "+isDiffucult);
        System.out.println();

        char letter='s', space=' ', specialCharacter='@', number='3';
        System.out.println("char letter : "+letter);
        System.out.println("char space : "+space);
        System.out.println("char specialCharacter : "+specialCharacter);
        System.out.println("char number : "+number);
        System.out.println();

        byte number1=-128, number2=0, number3=127;
        System.out.println("byte number1 : "+number1);
        System.out.println("byte number2 : "+number2);
        System.out.println("byte number3 : "+number3);
        System.out.println();

        short height1=-32768, height2=180, height3=32767;
        System.out.println("short height1 : "+height1);
        System.out.println("short height2 : "+height2);
        System.out.println("short height3 : "+height3);
        System.out.println();

        int day=8, month=12, year=2022;
        System.out.println("int day : "+day);
        System.out.println("int month : "+month);
        System.out.println("byte year : "+year);
        System.out.println();

        long distance1=500,distance2=1000, distance3=1500;
        System.out.println("long distance1 : "+distance1);
        System.out.println("long distance2 : "+distance2);
        System.out.println("long distance3 : "+distance3);
        System.out.println();

        float weight1=55.78f, weight2=75.67f, weight3=102.68f;
        System.out.println("float weight1 : "+weight1);
        System.out.println("float weight2 : "+weight2);
        System.out.println("float weight3 : "+weight3);
        System.out.println();

        double decimalNumber1=376982.4098765442, decimalNumber2=45.54, decimalNumber3=0.453;
        System.out.println("double decimalNumber1 : "+decimalNumber1);
        System.out.println("double decimalNumber2 : "+decimalNumber2);
        System.out.println("double decimalNumber3 : "+decimalNumber3);
        System.out.println();

        //2-Primitive Data Turlerinin minimum ve maximum degerleri

        System.out.println("byte min value : "+Byte.MIN_VALUE);
        System.out.println("byte max value : "+Byte.MAX_VALUE);
        System.out.println();
        System.out.println("short min value : "+Short.MIN_VALUE);
        System.out.println("short max value : "+Short.MAX_VALUE);
        System.out.println();
        System.out.println("int min value : "+Integer.MIN_VALUE);
        System.out.println("int max value : "+Integer.MAX_VALUE);
        System.out.println();
        System.out.println("long min value : "+Long.MIN_VALUE);
        System.out.println("long max value : "+Long.MAX_VALUE);
        System.out.println();
        System.out.println("float min value : "+Float.MIN_VALUE);
        System.out.println("float max value : "+Float.MAX_VALUE);
        System.out.println();
        System.out.println("double min value : "+Double.MIN_VALUE);
        System.out.println("double max value : "+Double.MAX_VALUE);
    }
}
