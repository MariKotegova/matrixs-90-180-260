 import java.util.Random;

public class Main {
    static final int SIZE = 8;
    public static void main(String [] args){
        int [][] arg = new int [SIZE][SIZE];

        System.out.println("Исходный массив: " + "\n");
        Random random = new Random();
        for (int i = 0; i < arg.length; i++){
            for (int j =0; j < arg[i].length; j++){
                arg[i][j] = random.nextInt(256);
                System.out.format("%4s", arg[i][j]);
            }
            System.out.println();
        }

       System.out.println("""

                Перевернутый на 270 градусов массив:\s
               """);

       int [][] colors = new int [SIZE][SIZE];
       for (int i = 0; i < colors.length; i++){
           for (int j =0; j < colors[i].length; j++){
               colors[i][j] = arg[j][colors.length -1 - i];
               System.out.format("%4s", colors[i][j]);

           }
           System.out.println();
       }
       System.out.println("""

                Перевернутый на 90 градусов массив:\s
               """);
       int [][] colors1 = new int [SIZE][SIZE];
       for (int i = 0; i < colors1.length; i++){
           for (int j =0; j < colors1[i].length; j++){
               colors1[i][j] = arg[colors1.length - 1 - j][i];
               System.out.format("%4s", colors1[i][j]);
           }
           System.out.println();
       }

        System.out.println("""
                \s
                 Перевернутый на 180 градусов массив:\s
                """);

        int [][] colors2 = new int [SIZE][SIZE];
        for (int i = 0; i < colors2.length; i++){
            for (int j =0; j < colors2[i].length; j++){
                colors2[i][j] = arg[colors2.length - 1 - i][colors2.length - 1 - j]; //     7 6    0 1
                System.out.format("%4s", colors2[i][j]);

            }
            System.out.println();
        }

    }
}
