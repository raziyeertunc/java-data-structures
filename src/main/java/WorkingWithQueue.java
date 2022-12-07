import java.net.StandardSocketOptions;
import java.util.LinkedList;
import java.util.Queue;


public class WorkingWithQueue {
    public static void main(String args[]) {

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("raziye",26));
        supermarket.add(new Person("ali",22));

        //gets first element which is raziye,26
        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
        //silinen elementi gösterir yani raziye silinir
        System.out.println(supermarket.poll());
        // size ı gösterir
        System.out.println(supermarket.size());


    }
/*

    static record Person(String name, int age) {
        return null;

 */
    }




