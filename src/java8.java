import javax.print.attribute.IntegerSyntax;
import java.math.BigDecimal;
import java.util.*;

public class java8 {
    public static void main(String[] args) {
//        Java Collection: LinkedList Exercises [7 көнүгүү]
//        1. LinkedList тизменин биринчи элементин алуу үчүн Java программасын жазыңыз.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(64);
        list.add(18);
        list.add(82);
        list.add(2);
        System.out.println(list.getFirst());
//
//        2. LinkedList тизменин акыркы элементин алуу үчүн Java программасын жазыңыз.
        System.out.println(list.getLast());
//
//        3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жаз.
        System.out.println(list.contains(18));
//
//        4. LinkedList тизмени массивдердин тизмесине которуу үчүн Java программасын жазыңыз.
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        System.out.println(Arrays.toString(array));
        LinkedList<Integer> newList = new LinkedList<>(list);
        System.out.println(newList);
//
//        5. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.
            LinkedList<Integer> list1 = new LinkedList<>();
            list1.add(2);
            list1.add(2);
            list1.add(2);
            list1.add(2);
        System.out.println(list1.equals(list));
//
//        6. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
        System.out.println(list.isEmpty());
//
//        7. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз.
        list.set(3,90);
        System.out.println(list);
//
//        __________________________________________________________________________________________
//
//        Java Collection: HashSet Exercises [12 көнүгүү]
//
//        The Hash Set: [
//        new BankAccount("OPTIMA","41692222" "7000")
//        new BankAccount("KYRGYZSTAN","41691111" "5000")
//        new BankAccount("DEMIR","41693333" "9000")
//        new BankAccount("RSK","41694444" "100000")
//]
//        1. Көрсөтүлгөн элементти HashSet топтомунун аягына кошуу үчүн Java программасын жазыңыз.
        Set<BankAccount> bankAccounts = new HashSet<>();
        bankAccounts.add(new BankAccount("OPTIMA","41692222", new BigDecimal(7000)));
        bankAccounts.add(new BankAccount("KYRGYZSTAN","41691111",new BigDecimal(5000)));
        bankAccounts.add(new BankAccount("DEMIR","41693333",new BigDecimal(9000)));
        bankAccounts.add(new BankAccount("RSK","41694444",new BigDecimal(100000)));
//
//        2. HashSet тизмедеги бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
        System.out.println(bankAccounts);
//
//        3. HashSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
//        System.out.println(bankAccounts.size());
//
//        4. HashSet топтомун бошотуу үчүн Java программасын жазыңыз.
//        bankAccounts.clear();
//        System.out.println(bankAccounts);
//
//        5. HashSet топтомунун бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
//        System.out.println(bankAccounts.isEmpty());

//
//        6. HashSet топтомун башка хэш топтомуна клондоо үчүн Java программасын жазыңыз.
        Set<BankAccount> newBankAccounts = new HashSet<>();
        try {
            for (BankAccount b : bankAccounts) {
            newBankAccounts.add(b.clone());
            }
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        newBankAccounts.forEach(System.out::println);


//
//        7. HashSet топтомун массивге айландыруу үчүн Java программасын жазыңыз.
            Set <Byte> bytes = new HashSet<>();
            bytes.add((byte) 34);
            bytes.add((byte) 45);
            bytes.add((byte) 34);
            bytes.add((byte) 8);

            byte[] arrayByte = new byte[bytes.size()];

            int index = 0;

            for (Byte b : bytes) {
                arrayByte[index] = b;
                index++;
            }
        System.out.println(Arrays.toString(arrayByte));

//
//        8. HashSet топтомун трисет топтомуна айландыруу үчүн Java программасын жазыңыз.
        Set<Byte> bytesTree = new TreeSet<>(bytes);
        System.out.println(bytesTree);
//
//        9. HshSet топтомун List/ ArrayListке айландыруу үчүн Java программасын жазыңыз.
        List<Byte> bytesList = new ArrayList<>(bytes);
        System.out.println(bytesList);
//
//        10. Эки HashSet топтомун салыштыруу үчүн Java программасын жазыңыз.
        Set<Integer> integers = new HashSet<>();
        Set<Integer> integers1 = new HashSet<>();
        integers.add(456);
        integers.add(232);
        integers.add(976);

        integers1.add(974);
        integers1.add(456);
        integers1.add(232);

        System.out.println(integers.equals(integers1));
//
//        11. Эки топтомду салыштыруу жана эки топтомдо бирдей элементтерди сактоо үчүн Java программасын жазыңыз.
        Set<Integer> equalsIntegers = new HashSet<>();
        for (Integer i : integers) {
            for (Integer j : integers1) {
                if (i.equals(j)) {
                    equalsIntegers.add(i);
                }
            }
        }
        System.out.println(equalsIntegers);
//
//        12. HashSet топтомунан бардык элементтерди алып салуу үчүн Java программасын жазыңыз.

        integers.clear();
//
//        _____________________________________________________________________________________________
//
//        Java Collection: TreeSet Exercises [16 көнүгүүлөр]
//
//        1. Жаңы TreeSet топтомун түзүү үчүн Java программасын жазыңыз, бир нече түстөрдү  кошуп, TreeSet топтомун басып чыгарыңыз.

        TreeSet<String> colours = new TreeSet<>();
        colours.add("grey");
        colours.add("white");
        colours.add("black");
        colours.add("green");
        System.out.println(colours);
//
//        2. TreeSet топтомундагы бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
        System.out.println(colours);
//
//        3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet топтомуна кошуу үчүн Java программасын жазыңыз.
        Set<String> newColours = new TreeSet<>(colours);
//
//        4. Берилген TreeSet топтомундагы элементтердин тескери иреттүү көрүнүшүн түзүү үчүн Java программасын жазыңыз.

        Set<String> descending = new TreeSet<>(Collections.reverseOrder());
       descending.addAll(colours);
        System.out.println(descending);
//
//        5. TreeSet топтомундагы биринчи жана акыркы элементтерди алуу үчүн Java программасын жазыңыз.
        System.out.println(colours.first());
        System.out.println(colours.last());

//
//        6. TreeSet тизмегин башка TreeSet топтомуна клондоо(clone) үчүн Java программасын жазыңыз.
        TreeSet<String> cloneTree = new TreeSet<>();
        cloneTree.addAll(colours);
//
//        7. TreeSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
        System.out.println(colours.size());
//
//        8. Эки TreeSet топтомун салыштыруу үчүн Java программасын жаз.
        System.out.println(colours.equals(cloneTree));
//
//        9. Tree топтомундагы 7ден аз сандарды табуу үчүн Java программасын жаз.
        TreeSet<Integer> intTree = new TreeSet<>();
        intTree.add(12);
        intTree.add(3);
        intTree.add(6);
        intTree.add(19);
        intTree.add(0);
        for (Integer i : intTree) {
            if (i < 7) {
                System.out.println(i);
            }
            }
//
//        10. Берилген элементтен чоң же ага барабар болгон TreeSet жыйындысынын элементин алуу үчүн Java программасын жазыңыз.
        int e = 5;
        for (Integer i : intTree) {
            if (i >= e){
                System.out.println(i);
            }
        }
//
//        11. Берилген элементтен кичине же ага барабар болгон TreeSet топтомундагы элементти алуу үчүн Java программасын жазыңыз.
        for (Integer i :
                intTree) {
            if (i <= e) {
                System.out.println(i);
            }
        }
//
//        12. TreeSet топтомунун биринчи элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
        System.out.println(colours.first());
        colours.remove(colours.first());

//
//        13. TreeSet топтомунун акыркы элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
        System.out.println(colours.last());
        colours.remove(colours.last());
//
//        14. Берилген элементти TreeSet жыйындысынан алып салуу үчүн Java программасын жазыңыз.
        colours.remove("grey");
    }
}
