package com.company;

import com.company.functional.ComparatorInt;
import com.company.functional.FunctionalInt;
import com.company.functional.FunctionalInterfaceParser;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        FunctionalInt convert = value -> converter(value);
//        System.out.println("***************");
//        System.out.println(convert.convertIn(1));
//        ComparatorInt comparator = ((a, b) -> compare(a,b));

        //////////////////////////////////////////
        FunctionalInt convert = Main::converter;
        System.out.println("***************");
        System.out.println(convert.convertIn(1));
        ComparatorInt comparator = (Main::compare);
        System.out.println("***************");
        Integer integer = comparator.compareIn(20, 2);
        System.out.println(integer);
        System.out.println("***************");
        System.out.println("***************");

        /////////////////////////////////////////
        List<String> strings = new java.util.ArrayList<>(List.of("C", "D", "F","A", "B"));
        Collections.sort(strings,(a,b)->compareString(a,b));
        System.out.println(strings);

        List<String> stringss = new java.util.ArrayList<>(List.of("C", "D", "F","A", "B"));
        Collections.sort(stringss,(a,b)->compareStringAndReplacesort(a,b));
        System.out.println(stringss);

        //////////////////////////////////////////
        System.out.println(" //////////////////////////////////////////");
        Main main = new Main();
        FunctionalInt newConvert = main::convert2string;
//        FunctionalInt newConvert = Main::convert2string;
        String s = newConvert.convertIn(55);
        System.out.println(s);

        //////////////////////////////////////////
        System.out.println(" //////////////////////////////////////////");
        FunctionalInterfaceParser interfaceParser = string-> Integer.parseInt(string);
//        interfaceParser.parser("123");
        System.out.println(interfaceParser.parser("123"));
        System.out.println(" //////////////////////////////////////////");
        FunctionalInterfaceParser interfaceParser2 = string->convertorStringToInteger(string);
//        interfaceParser.parser("123");
        System.out.println(interfaceParser2.parser("123"));

    }

    public static String converter(Integer value){
       return String.valueOf(value);
    }

    public static Integer compare(Integer a,Integer b){
        return a.compareTo(b);
    }

    public static Integer compareString(String a,String b){
        return a.compareTo(b);
    }

    public static Integer compareStringAndReplacesort(String a,String b){
        return b.compareTo(a);

    }

     String convert2string(Integer value){
        return String.valueOf(value);
    }

    static Integer convertorStringToInteger(String value){
      return Integer.valueOf(value);
    }
}
