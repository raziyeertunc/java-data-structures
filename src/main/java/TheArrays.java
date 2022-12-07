
import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        //gives me random numbers
        System.out.println(colors);
        //gives me whole array
        System.out.println(Arrays.toString(colors));
        //gives me index 0
        System.out.println(colors[0]);
        //gives me null
        System.out.println(colors[4]);

        /*
        array index is out of bound and gives me error
        System.out.println(colors[5]);
         */

        //5th element will be yellow
        colors[4] = "yellow";
        System.out.println(colors[4]);
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        System.out.println("--");
        for (int i = colors.length-1 ; i >=0; i--){
            System.out.println(colors[i]);

        }
        //enhanced for loop
        // : means that "in"
        for( String color : colors){
            System.out.println(color);
        }
        Arrays.stream(colors).forEach(System.out::println);








    }
}
