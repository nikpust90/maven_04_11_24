package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Work_3 {
    public static void main(String[] args) {
        //3
        //
        //
        //1. Создай список слов, заполни его самостоятельно.
        //2. Метод fix должен:
        //2.1. удалять из списка строк все слова, содержащие букву "р"
        //2.2. удваивать все слова содержащие букву "л".
        //2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
        //2.4. с другими словами ничего не делать.
        //
        //

        List<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
        //логирование
        ExampleClass example = new ExampleClass();
        example.doSomething();
    }

    public static List<String> fix(List<String> strings) {
        //напишите тут ваш код


        List<String> oneList = strings.stream()

                .flatMap(s -> {
                    if (s.contains("л") && s.contains("р")){
                        return Stream.of(s);
                    } else if (s.contains("л")){
                        return Stream.of(s + s);
                    } else {
                        return Stream.empty();
                    }
                })
                .toList();




        return oneList;
    }
}
