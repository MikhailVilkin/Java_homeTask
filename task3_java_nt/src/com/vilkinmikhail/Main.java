/*
 * Вилкин Михаил
 * Приожение IOChamber
 */

package com.vilkinmikhail;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            scanAndPrint(new Scanner(System.in));
        } else {
            try {
                File file = new File(args[0]);
                scanAndPrint(new Scanner(file));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void scanAndPrint(Scanner sc) {

        ArrayList<String> strings = new ArrayList<>();

        String tmp;
        while (sc.hasNextLine() && !(tmp = sc.nextLine()).isEmpty()) {
            strings.add(tmp);
        }

        for (int i = 0; i < strings.size(); i+=2) {
            System.out.println(strings.get(i));
        }
    }
}
