/** Course Code: EYF649
 *  Submission:  DS07_SelectionSort
 *  Due Date:    20181203
 *  Author:      Sean Mis
 *  Description: This program creates the Selection
 *               Sort method
 */

public class DS07_SM_SelectionSort {

    /** Create a private helper method that find the
     * index of the smallest value in an array */
    private static <T extends Comparable<? super T>>
    int getIndexOfSmallest(T[] a, int first, int last) {
        T min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if (a[index].compareTo(min) < 0) {
                min = a[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }
    /** Create a private helper method that swaps two
     * items in an array */
    private static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    /** Create a public method that finds the smallest
     * value and swaps it, finds the second smallest
     * value and swaps it, and continues until the end
     * of the array is reached */
    public static <T extends Comparable<? super T>>
    void selectionSort(T[] a) {
        int last = a.length - 1;
        for (int index = 0; index < last; index++) {
            int indexNextSmallest =
                    getIndexOfSmallest(a, index, last);
            swap(a, index, indexNextSmallest);
        }
    }

}
