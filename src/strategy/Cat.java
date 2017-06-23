package strategy;

import java.util.Comparator;

/**
 * Created by wyb.
 */
public class Cat implements Comparable<Cat> {

    private int height;
    private int weight;
    private Comparator<Cat> comp = new WeightComparator();

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void setComp(Comparator<Cat> comp) {
        this.comp = comp;
    }

    @Override
    public int compareTo(Cat c) { // 以 this 为标准
       return comp.compare(this, c);
    }

    public static Comparator<Cat> getHeightComparator() {
        return new HeightComparator();
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    private static class WeightComparator implements Comparator<Cat> {

        @Override
        public int compare(Cat c1, Cat c2) {
            if (c1.weight > c2.weight) {
                return 1;
            } else if (c1.weight < c2.weight) {
                return -1;
            }
            return 0;
        }
    }

    private static class HeightComparator implements Comparator<Cat> {
        @Override
        public int compare(Cat c1, Cat c2) {
            if (c1.height > c2.height) {
                return 1;
            } else if (c1.height < c2.height) {
                return -1;
            }
            return 0;
        }
    }
}
