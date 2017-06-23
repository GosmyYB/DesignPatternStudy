package strategy;

/**
 * Created by wyb.
 */
public class Test {
    public static void main(String[] args) {
        //int[] a = {9, 5, 3, 7, 1};
        Cat[] cats = {new Cat(5, 3), new Cat(2, 1), new Cat(6, 2)};
        DataSorter.sort(cats, Cat.getHeightComparator());
        DataSorter.print(cats);
    }
}
