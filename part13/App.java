package part13;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // String name = "John";
        // System.out.println(name.length());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.charAt(2));
        // System.out.println(name.indexOf('o'));
        // System.out.println(name.substring(1, 4));
        // System.out.println(name.replace('o', 'a'));
        // System.err.println(name.equals("John"));
        // System.out.println(name.isEmpty());
        // System.out.println(name.trim());
        // System.out.println(name.startsWith("J"));
        // System.out.println(name.endsWith("n"));
        // System.out.println(name.concat(" Doe"));
        // System.out.println(name.split("o")[0]);
        // System.out.println(name.contains("hn"));
        // System.out.println(name.equalsIgnoreCase("john"));
        // int a = 9;
        // System.out.println(Math.sqrt(a));
        // System.out.println(Math.pow(a, 2));
        // System.out.println(Math.max(a, 5));
        // System.out.println(Math.min(a, 5));
        // System.out.println(Math.round(4.6));
        // System.out.println(Math.ceil(4.2));
        // System.out.println(Math.floor(4.8));
        // System.out.println(Math.random());
        // System.out.println(Math.abs(-10));
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("blueberry");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.contains("Banana"));
        System.out.println(list.indexOf("Cherry"));
        System.out.println(list.isEmpty());
        List<String> list2 = List.of("orange","grapes");
        list.addAll(list2);
        System.out.println(list);

    }
}
