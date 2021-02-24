package org.example.homework4;


import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

import static java.util.Map.Entry.comparingByValue;

//Основная задача - реализовать интерфейс Aggregator. Уже есть класс, который реализует
//этот интерфейс, но его методы выбрасывают исключения UnsupportedOperationException.
//Нужно написать реализацию этих методов:
//1. int sum(List<Integer> numbers) - используйте этот метод, чтобы найти сумму целых
//чисел.
//2. getMostFrequentWords() - Используйте этот метод, чтобы найти самые часто
//встречающиеся слова
//3. getDuplicates() - метод возвращает слова дубликаты.

public class Java8Aggregator implements Aggregator {
    @Override
    public int sum(List<Integer> numbers) {
        try (IntStream intStream = numbers.stream().mapToInt(integer -> integer.intValue())) {
            int intSum = intStream.sum();
            return intSum;
        } catch (UnsupportedOperationException e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Map<String, Long> getMostFrequentWords(List<String> words, long limit) {
        Map<String, Long> result = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<String, Long> entry : result.entrySet()) {
            if (entry.getValue() > limit) {
                throw new UnsupportedOperationException();
            }
        }
        return result;
    }

    @Override
    public List<String> getDuplicates(List<String> words, long limit) {
        List<String> tmp = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        tmp.forEach(x -> {
            if (Collections.frequency(tmp, x) > limit) {
                throw new UnsupportedOperationException();
            }
        });
        List<String> duplicates = tmp.stream()
                .filter(x -> Collections.frequency(tmp, x) > 1 && Collections.frequency(tmp, x) <= limit)
                .distinct()
                .collect(Collectors.toList());
        return duplicates;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Java8Aggregator java8Aggregator = new Java8Aggregator();
        System.out.println(java8Aggregator.sum(numbers));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        List<String> strings = List.of("PHP", "JS", "java", "jS", "Python", "java", "Java", "JaVA", "AAA", "aaa", "aaA");
        Map<String, Long> map = java8Aggregator.getMostFrequentWords(strings, 4);
        System.out.println(map);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println(java8Aggregator.getDuplicates(strings, 4));
    }
}
