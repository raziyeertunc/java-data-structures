import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String args[]){
        /*
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );
        colorsUnmodifiable.add("pink");
        */
        System.out.println("-------------");

        // ArrayList is a re-sizable array, also called a dynamic array.
        // It grows its size to accommodate new elements and shrinks the size when the elements are removed.
        //allows you to retrieve the elements by their index.
        //You cannot create an ArrayList of primitive types like int, char etc. You need to use boxed types like Integer, Character, Boolean etc.

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        //I said String I can't add 1
        //colors.add(1);
        // I can add only String
        // colors.add(new Object());
        System.out.println(colors);
        // gives me array's size
        System.out.println(colors.size());
        // blue var mı yok mu
        System.out.println(colors.contains("blue"));
        //pink var mı yok mu
        System.out.println(colors.contains("pink"));
    }
}
