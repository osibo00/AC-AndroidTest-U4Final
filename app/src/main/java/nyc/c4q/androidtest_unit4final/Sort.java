package nyc.c4q.androidtest_unit4final;

import java.util.List;

/**
 * Created by justiceo on 1/7/18.
 */

public class Sort {

    /**
     * Sorts a list using the selection sort algorithm.
     * See lecture on sorting: https://github.com/C4Q/AC-Android/tree/v2/DSA/sorting
     *
     * When `isAscending` is true, the list is sorted in ascending alphabetical order from a to z,
     * otherwise it is sorted in descending order from z to a.
     * @param list
     * @param isAscending
     */
    public static void selectionSort(List<String> list, boolean isAscending) {
        // TODO: Implement selection sort.
        // You may not use Collections.sort or its equivalent
        // You may not implement another sorting algorithm that is not "selection sort"
        // Tip: Try a version without ordering first.
        if (isAscending) {
            stringsAToZ(list);
        } else {
            stringsZToA(list);
        }
    }

    private static void stringsAToZ(List<String> list) {
        for (int n = list.size(); n > 0; n--) {
            int smallest = list.size() - 1;
            for(int i = 0; i < n; i++) {
                if (list.get(smallest).compareTo(list.get(i)) < 0) {
                    smallest = i;
                }
            }
            String temp = list.get(smallest);
            //list.get(smallest) = list.get(n-1);
            list.set(smallest, list.get(n-1));
            //list.get(n-1) = temp;
            list.set(n-1, temp);
        }
    }

    private static void stringsZToA(List<String> list) {
        for (int n = list.size(); n > 0; n--) {
            int largest = 0;
            for(int i = 0; i < n; i++) {
                if (list.get(i).compareTo(list.get(largest)) < 0) {
                    largest = i;
                }
            }
            String temp = list.get(largest);
            //strings[largest] = strings[n-1];
            list.set(largest, list.get(n-1));
            //strings[n-1] = temp;
            list.set(n-1, temp);
        }
    }
}
