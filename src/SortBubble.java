import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortPrinter {
    private SortTest sortTest;
    private final List<Integer> itemList = new ArrayList<>();

    public void insert(int item) {
        itemList.add(item);
    }

    public void selection(SortTest sTest) {
        this.sortTest = sTest;
    }

    public void run() {
        sortTest.sort(itemList);
    }

    public void show() {
        System.out.println(sortTest.getClass().getSimpleName());
        System.out.println(Arrays.toString(itemList.toArray()));
        System.out.println();
    }


    public static void main(String[] args) {
        SortPrinter sortPrinter = new SortPrinter();
        sortPrinter.insert(5);
        sortPrinter.insert(4);
        sortPrinter.insert(3);
        sortPrinter.insert(2);
        sortPrinter.insert(1);
        sortPrinter.insert(6);
        sortPrinter.insert(9);
        sortPrinter.insert(8);
        sortPrinter.insert(7);

        sortPrinter.selection(new SortBubble());
        sortPrinter.run();
        sortPrinter.show();

        sortPrinter.selection(new SortSelection());
        sortPrinter.run();
        sortPrinter.show();
    }
}
