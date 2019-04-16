/** Course Code: EYF649
 *  Submission:  DS07_QuickSort
 *  Due Date:    20181203
 *  Author:      Sean Mis
 *  Description: This program creates the Quick
 *               Sort method
 */

public class DS07_SM_QuickSort_2 {

    private static int partition(Integer[] a, int first, int last) {

        int pivot = a[last];
        int i = (first - 1);
        for (int j = first; j < last; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[last];
        a[last] = temp;

        return i + 1;

    }

    public static void quickSort(Integer[] a, int first, int last) {

        if (first < last) {
            int pivotIndex = partition(a, first, last);
            quickSort(a, first, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, last);
        }

    }

}
