package java.elemofprog;

public class ElementOfProgramInterview {

    public ElementOfProgramInterview(){ }

    public static void bits(){
        int x = -5; // 5=0101 --> 2's comp = 1010 + 0001 = 1011
        int y = x >> 1; // 1011 --> 1101 --> 2's comp = 0010 + 0001 = 0011 with sign bit the same
        int z = x >>> 1; // 1011 --> 0101 --> 2's comp = 1010 + 0001 = 1011 with sign bit the same
        System.out.println("x = " + x); //0000 0000 0000 0000 0000 0000 0000 1011
        System.out.println("x >> 1 = " + y); //0000 0000 0000 0000 0000 0000 0000 0011
        System.out.println("x >>> 1 = " + z); //0000 0000 0000 0000 0000 0000 0000 1011
    }

}
