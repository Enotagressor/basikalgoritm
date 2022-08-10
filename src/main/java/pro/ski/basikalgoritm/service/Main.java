package pro.ski.basikalgoritm.service;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            StringList stringList = new StringListImpl();
            System.out.println(stringList.add("Карл"));
            System.out.println(stringList.get(0));
            System.out.println(stringList.add("Джон"));
            System.out.println(stringList.get(1));
            System.out.println(stringList.contains("Джон"));
            System.out.println(stringList.remove("Карл"));
            System.out.println(stringList.contains("Карл"));
            System.out.println(stringList.get(0));
            System.out.println(stringList.add("Игорь"));
            System.out.println(stringList.indexOf("Игорь"));
            System.out.println(stringList.lastIndexOf("Игорь"));
            System.out.println(stringList.indexOf("Джон"));
            System.out.println(stringList.set(1, "Жан"));
            System.out.println(stringList.contains("Жан"));
            System.out.println(Arrays.toString(stringList.toArray()));
            System.out.println(stringList.remove(1));
            System.out.println(stringList.contains("Карл"));
            System.out.println(stringList.get(1));
            System.out.println(stringList.add(0, "Зульфия"));
            System.out.println(Arrays.toString(stringList.toArray()));
            StringList stringList2 = new StringListImpl();
            stringList2.add(("Зульфия"));
            stringList2.add(("Джон"));
            System.out.println(stringList.equals(stringList2));
            stringList.clear();
            System.out.println(stringList.get(1));
        }
    }

