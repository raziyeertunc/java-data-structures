
import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static  void main(String args[]) {
        //order is not guaranteed
        //duplicates are not allowed
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("pink"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("pink"));
        balls.forEach(System.out::println);
    }


}
