package DataTypes;

public class Overflow {
    public static void main(String args[]){

         //Overflow prints minimum value
        byte b = 127;
        b++;
        System.out.println("Byte overflow: " + b);

        short s = 32767;
        s++;
        System.out.println("Short overflow: " + s);


        int i = 2147483647;
        i++;
        System.out.println("Int overflow: " + i);
    }
}
