package org.example;



import java.util.*;


public class Work_1 implements Comparator<String> {
    public static void main(String[] args) {
        //1
        //
        //
        //Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.


            List<String> list = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                list.add(scanner.nextLine());
            }
            list.remove(2);


            Collections.reverse(list);

            list.forEach(System.out::println);

            //логирование
            ExampleClass example = new ExampleClass();
            example.doSomething();





    }






    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }


}
