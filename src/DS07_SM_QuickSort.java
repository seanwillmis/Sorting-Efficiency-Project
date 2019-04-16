/** Course Code: EYF649
 *  Submission:  DS07_QuickSort
 *  Due Date:    20181203
 *  Author:      Sean Mis
 *  Description: This program creates the Quick
 *               Sort method
 */

public class DS07_SM_QuickSort
        extends DS07_SM_InsertionSort {

    /** Create a private helper method that chooses
     * the pivot by determining the median value;
     * select the median of three entries, then
     * sort first, middle, and last */
    private static <T extends Comparable<? super T>>
    void sortFirstMiddleLast(T[] a, int first,
                             int mid, int last) {

        if (a[first].compareTo(a[mid]) > 0) {
            swap(a, first, mid);
        }
        if (a[mid].compareTo(a[last]) > 0) {
            swap(a, mid, last);
            if(a[first].compareTo(a[mid]) > 0) {
                swap(a, first, mid);
            }
        }
    }
    /** Create a private helper method that swaps two
     * items in an array */
    private static void swap(Object[] array, int i,
                             int j) {

        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /** Create a private helper method that partitions
     * the array by preparing for partitioning,
     * partitioning the entries, and moving the pivot
     * into place */
    private static <T extends Comparable<? super T>>
    int partition(T[] a, int first, int last) {

        int mid = (first + last) / 2;
        sortFirstMiddleLast(a, first, mid, last);
        swap(a, mid, last - 1);
        int pivotIndex = last - 1;
        T pivot = a[pivotIndex];

        int indexFromLeft = first + 1;
        int indexFromRight = last - 2;
        boolean done = false;
        while (!done) {
            while (a[indexFromLeft].compareTo(pivot) < 0) {
                indexFromLeft++;
            }
            while (a[indexFromRight].compareTo(pivot) > 0) {
                indexFromRight--;
            }
            if (indexFromLeft < indexFromRight) {
                swap(a, indexFromLeft, indexFromRight);
                indexFromLeft++;
                indexFromRight--;
            } else {
                done = true;
            }
        }
        swap(a, pivotIndex, indexFromLeft);
        pivotIndex = indexFromLeft;
        return pivotIndex;
    }

    public static <T extends Comparable<? super T>>
    void quickSort(T[] a, int first, int last) {

        final int MIN_SIZE = 5;
        if (last - first + 1 < last) {
            quickSort(a, first, last);
        } else {
            int pivotIndex = partition(a, first, last);
            quickSort(a, first, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, last);
        }
    }

}
