
package day11;

import java.util.Arrays;

public class SortStrings {

    public static void main(String[] args) {

        String[] products = {"Monitor", "Keys", "Charger", "Keyboard", "Mouse"};

        Arrays.sort(products);

        System.out.println("Sorted Products:");
        for (String p : products) {
            System.out.println(p);
        }
    }
}