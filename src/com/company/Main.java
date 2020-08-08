package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            array.add(scanner.nextInt());
        }

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            numbers.add(scanner.nextInt());
        }

        if (array.size() == N &&
                numbers.size() == M) {
            numbers.stream()
                    .map(array::contains)
                    .forEach(aBoolean -> System.out.println(aBoolean ? "True" : "False"));
        }
    }
}
