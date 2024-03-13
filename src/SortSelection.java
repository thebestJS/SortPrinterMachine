import java.util.List;

public class SortSelection implements SortTest {
    @Override
    public void sort(List<Integer> itemList) {
        for(int num_i = 0 ; num_i < itemList.size(); num_i++) {
            for(int num_j = num_i + 1 ; num_j < itemList.size(); num_j ++) {
                if(itemList.get(num_i) > itemList.get(num_j)){
                    int tmp = itemList.get(num_i);
                    itemList.set(num_i, itemList.get(num_j));
                    itemList.set(num_j, tmp);
                }
            }
        }
    }
}
