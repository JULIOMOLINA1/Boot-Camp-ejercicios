package Colecciones;
import java.util.ArrayList;
import java.util.Collection;
public class Colection {
    public static void main(String []args){
        Collection<Integer> Numbers = new ArrayList<>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(5);
        System.out.println("The number 3 exist in the list?" + Numbers.contains(3));
        System.out.println("The amount of elements in the list is: " + Numbers.size());
    }
}
