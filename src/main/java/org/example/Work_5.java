package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Work_5 {
    public static void main(String[] args) {
        //5
        //
        //
        //1. Введи с клавиатуры 10 слов в список строк.
        //2. Определить, является ли список упорядоченным по возрастанию длины строки.
        //3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(scanner.nextLine());
        }

        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > list.get(i + 1).length()) {
                index = i + 1;
                System.out.println(index);
                break;

            }
        }
        //логирование
        ExampleClass example = new ExampleClass();
        example.doSomething();
    }
}
