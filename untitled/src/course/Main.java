package course;

public class Main {
    public static void main(String[] args) {
        int a = 2147483647;
        int a1 =  -2147483648;
        double c1 = -1.7E-308;
        double c2 = 1.7E+308;
        float d1 = -3.4E-38f;
        float d2 = 3.4E+38f;
        long s1 = 2147483647;
        long s2 = -2147483648;
        short q1 = -32768;
        short q2 = 32767;
        byte k1 = 127;
        byte k2 = -128;


        System.out.println("max int = "+ a);
        System.out.println("min int = "+ a1);
        System.out.println("max double = "+ c2);
        System.out.println("min double = "+ c1);
        System.out.println("max float = "+ d2);
        System.out.println("min float = "+ d1);
        System.out.println("max long = "+ s1);
        System.out.println("min long = "+ s2);
        System.out.println("max short = "+ q1);
        System.out.println("min short = "+ q2);
        System.out.println("max byte = "+ k1);
        System.out.println("min byte = "+ k2);


        int [] array = {1, -2 , 3, 4, 5, 6, 7, 8, 9 ,10};
        int max = 0;
        int min = 10;
        for (int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
            if (min>array[i]){
                min = array[i];
            }

        }
        System.out.println("max = " +max);
        System.out.println("min = " +min);











    }
}
