package strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wyb.
 */
public class DataSorter {

    public static void sort(Object[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                Comparable c1 = (Comparable)a[j];
                Comparable c2 = (Comparable)a[min];
                if (c1.compareTo(c2) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                swap(a, i, min);
            }
        }
    }

    public static void sort(Comparable[] a, Comparator comp) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                Comparable c1 = a[j];
                Comparable c2 = a[min];
                if (comp.compare(c1, c2) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                swap(a, i, min);
            }
        }
    }

    private static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void print(Object[] a) {
        System.out.println(Arrays.toString(a));
    }
}
