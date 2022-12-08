import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(7);
        numbers.add(34);
        numbers.add(64);
        numbers.add(9);
        ListIterator<Integer> iter = numbers.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        String str = "reade";
        if (str.charAt(0) == str.charAt((str.length()-1))){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        boolean b = str.charAt(0) == str.charAt((str.length()-1));
        String string = "reade";
//        LinkedList<Character>
//        ListIterator<Character> iterator =
    }
}