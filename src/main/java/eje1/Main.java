package eje1;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        ArrayList<Integer> numeros = new ArrayList<>();
//        Integer n = random.nextInt(199)-99;
//        while (n != -99){
//            numeros.add(n);
//            n = random.nextInt(199)-99;
//        }
        ArrayList<Integer> numeros = random.ints(-99, 100)
                        .boxed()
                        .takeWhile(n -> n != -99)
                        .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("cant= " + numeros.size());
        System.out.println("suma= " + numeros.stream().mapToInt(Integer::intValue).sum());
        System.out.println("prom= " + numeros.stream().mapToInt(Integer::intValue).average());
        numeros.forEach(n -> System.out.print(n + ", "));
    }
}