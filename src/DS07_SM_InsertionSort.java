/** Course Code: EYF649
 *  Submission:  DS07_InsertionSort
 *  Due Date:    20181203
 *  Author:      Sean Mis
 *  Description: This program creates the Insertion
 *               Sort method
 */

public class DS07_SM_InsertionSort
        extends DS07_SM_SelectionSort {

    /** Create a private helper method that starts
     * at the last sorted item and compares it to
     * the item to insert; if the item to insert is
     * smaller move the sorted item to the right
     * and compare it to the next sorted item; if
     * the item to insert is larger, or we've
     * reached the first element, end the search
     * and insert the item */
    private static void
    insertInOrder(int entryToInsert, Integer[] a,
                  int begin, int end) {

        int index = end;
        while ((index >= begin) &&
                (entryToInsert < a[index])) {
            a[index + 1] = a[index];
            index--;
        }
        a[index + 1] = entryToInsert;
    }
    /** Create a public method that takes the first
     * unsorted item and inserts it in the sorted
     * partition of the array; repeat for each
     * unsorted item */
    public static void insertionSort(Integer[] a) {

        for (int unsorted = 1; unsorted <
                a.length; unsorted++) {
            int firstUnsorted = a[unsorted];
            insertInOrder(firstUnsorted, a, 0,
                    unsorted - 1);
        }
    }

}
