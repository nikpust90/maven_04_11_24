package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work_2 {
    public static void main(String[] args) {
        //2
        //
        //
        //1. Создай список из слов "мама", "мыла", "раму".
        //2. После каждого слова вставь в список строку, содержащую слово "именно".
        //3. Вывести результат на экран, каждый элемент списка с новой строки.
        List<String> list = new ArrayList<>(Arrays.asList("мама", "мыла", "раму"));
        for (int i = 1; i <= list.size(); i++) {
            list.add(i++, "именно");
        }
        list.forEach(x -> System.out.println(x));

        //логирование
        ExampleClass example = new ExampleClass();
        example.doSomething();
    }
}
