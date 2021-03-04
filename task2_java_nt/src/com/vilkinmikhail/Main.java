/*
 * Вилкин Михаил
 * Приожение EchoChamber
 */

package com.vilkinmikhail;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String tmp;
        while (!(tmp = sc.nextLine()).isEmpty()) {
            strings.add(tmp);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
