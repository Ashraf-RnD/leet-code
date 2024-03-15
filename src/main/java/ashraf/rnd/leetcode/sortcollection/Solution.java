package ashraf.rnd.leetcode.sortcollection;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
//        straightCollectionSort();
//        compareAndSort();




    }

    public static void straightCollectionSort() {
        List<String> names = Arrays.asList("Alex", "Charles", "Brian", "David");
        Collections.sort(names);
        System.out.println("names = " + names);
        names.sort(Collections.reverseOrder());
        System.out.println("names = " + names);

        var nameList = names.stream()
                .sorted(Collections.reverseOrder())
                .toList();
        System.out.println("nameList = " + nameList);
    }

    public static void compareAndSort(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        people.sort(new PersonComparator());

        System.out.println("people = " + people);
    }

    public static void mapSort(){
        Map<Integer, String> map = new HashMap<>();

        map.put(20, "Charles");
        map.put(30, "Bob");
        map.put(23, "Albi");

        List<Map.Entry<Integer,String>> entries = new ArrayList<>(map.entrySet());

        entries.sort(Map.Entry.comparingByKey());
    }

}
