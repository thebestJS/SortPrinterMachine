import java.util.List;

public class SortBubble implements SortTest {
    @Override
    public void sort(List<Integer> itemList) {
        for(int cycle = 0 ;cycle < itemList.size(); cycle ++) {
            for(int num_i = 0 ; num_i < itemList.size() - 1 - cycle; num_i ++) {
                if(itemList.get(num_i) > itemList.get(num_i + 1)){
                    //swap
                    int tmp = itemList.get(num_i);
                    itemList.set(num_i, itemList.get(num_i + 1));
                    itemList.set(num_i + 1, tmp);
                }
            }
        }
    }
}
