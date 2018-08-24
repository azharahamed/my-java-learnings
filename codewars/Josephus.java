import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Josephus {
  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
      int itemsSize = items.size();
      if(k<1 || itemsSize == 0) return items;
      List<T> returnList = new ArrayList<>();
      List<T> copyList = new ArrayList<>(items);
      int returnListSize = returnList.size();
      int counter =0;//= (k-1)%copyList.size();
      while(returnListSize < itemsSize) {
          if (copyList.size() != 0)
            counter = (counter+(k-1))%copyList.size();
          returnList.add(copyList.get(counter));
          returnListSize = returnList.size();
          copyList.remove(counter);
      }
      return returnList;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) + ":" + josephusPermutation(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1));
        System.out.println(josephusPermutation(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2));
        System.out.println(josephusPermutation(Arrays.asList("C", "o", "d", "e", "W", "a", "r", "s"), 4));
        System.out.println(josephusPermutation(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3));
        System.out.println(josephusPermutation(Arrays.asList(new Object[]{}), 3));
    }
}