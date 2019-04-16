/** Course Code: EYF649
 *  Submission:  DS07_TestSort
 *  Due Date:    20181203
 *  Author:      Sean Mis
 *  Description: This program creates two methods for
 *               testing the Sort methods; the first,
 *               printIntegerArray, is for methods that
 *               have parameters of T[]; the second,
 *               printIntArray, is for methods that
 *               have parameters of int[]
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DS07_SM_TestSort {

    private final static int FIVEK = 5000;
    private final static int TENK = 10000;
    private final static int TWENTY_FIVEK = 25000;
    private final static int FIFTYK = 50000;

    private static Scanner input = new Scanner(System.in);
    private static File file5k = new File("sort5k.txt");
    private static File file10k = new File("sort10k.txt");
    private static File file25k = new File("sort25k.txt");
    private static File file50k = new File("sort50k.txt");
    private final static int TEST_SIZE = 10000;

    /** Declare variables for mean time */
    private static long startTime, endTime, duration;
    private static long[] time = new long[TEST_SIZE];
    /** Declare variables for standard deviation */
    private static double sum = 0, mean = 0, deviation = 0, variance = 0;

    /** Create empty wrapper class variables */
    private static Integer[] fiveK = new Integer[FIVEK];
    private static Integer[] tenK = new Integer[TENK];
    private static Integer[] twentyFiveK = new Integer[TWENTY_FIVEK];
    private static Integer[] fiftyK = new Integer[FIFTYK];

    private static DS07_SM_SelectionSort ss = new DS07_SM_SelectionSort();
    private static DS07_SM_InsertionSort is = new DS07_SM_InsertionSort();
    private static DS07_SM_QuickSort_2 qs = new DS07_SM_QuickSort_2();
    private static DS07_SM_ShellSort_2 shs = new DS07_SM_ShellSort_2();

    public static void main(String [] args) throws FileNotFoundException {

        int choice; // variable for Menu

        System.out.println("0. Exit");
        System.out.println("01. Selection Sort 5k");
        System.out.println("02. Selection Sort 10k");
        System.out.println("03. Selection Sort 25k");
        System.out.println("04. Selection Sort 50k");
        System.out.println("05. Insertion Sort 5k");
        System.out.println("06. Insertion Sort 10k");
        System.out.println("07. Insertion Sort 25k");
        System.out.println("08. Insertion Sort 50k");
        System.out.println("09. Quick Sort 5k");
        System.out.println("10. Quick Sort 10k");
        System.out.println("11. Quick Sort 25k");
        System.out.println("12. Quick Sort 50k");
        System.out.println("13. Shell Sort 5k");
        System.out.println("14. Shell Sort 10k");
        System.out.println("15. Shell Sort 25k");
        System.out.println("16. Shell Sort 50k");
        System.out.print("Please select a sorting method: ");
        choice = validateNumber();

        while (choice != 0) {
            switch (choice) {
                case 1: // Selection Sort 5K

                    runSelectionSort(file5k, fiveK, FIVEK, ss);
                    System.out.println("The time result for Selection Sort " +
                            "5k are: ");
                    meanTime();
                    standardDeviation();
                    break;

                case 2: // Selection Sort 10K

                    runSelectionSort(file10k, tenK, TENK, ss);
                    System.out.println("The time results for Selection Sort " +
                            "10k are: ");
                    meanTime();
                    standardDeviation();
                    break;

                case 3: // Selection Sort 25K

                    runSelectionSort(file25k, twentyFiveK, TWENTY_FIVEK, ss);
                    System.out.println("The time results for Selection Sort " +
                            "25k are: ");
                    meanTime();
                    standardDeviation();
                    break;

                case 4: // Selection Sort 50K

                    runSelectionSort(file50k, fiftyK, FIFTYK, ss);
                    System.out.println("The time results for Selection Sort " +
                            "50k are: ");
                    meanTime();
                    standardDeviation();
                    break;

                case 5: // Insertion Sort 5K

                    runInsertionSort(file5k, fiveK, FIVEK, is);
                    System.out.println("The time result for Insertion Sort " +
                            "5k are: ");
                    meanTime();
                    standardDeviation();

                    break;

                case 6: // Insertion Sort 10K

                    runInsertionSort(file10k, tenK, TENK, is);
                    System.out.println("The time results for Insertion Sort " +
                            "10k are: ");
                    meanTime();
                    standardDeviation();

                    break;

                case 7: // Insertion Sort 25K

                    runInsertionSort(file25k, twentyFiveK, TWENTY_FIVEK, is);
                    System.out.println("The time results for Insertion Sort " +
                            "25k are: ");
                    meanTime();
                    standardDeviation();

                    break;

                case 8: // Insertion Sort 50K

                    runInsertionSort(file50k, fiftyK, FIFTYK, is);
                    System.out.println("The time results for Insertion Sort " +
                            "50k are: ");
                    meanTime();
                    standardDeviation();

                    break;

                case 9: // Quick Sort 5K

                    runQuickSort(file5k, fiveK, FIVEK, qs);
                    System.out.println("The time result for Quick Sort " +
                            "5k are: ");
                    meanTime();
                    standardDeviation();

                    break;

                case 10: // Quick Sort 10K

                    runQuickSort(file10k, tenK, TENK, qs);
                    System.out.println("The time results for Quick Sort " +
                            "10k are: ");
                    meanTime();
                    standardDeviation();

                    break;

                case 11: // Quick Sort 25K

                    runQuickSort(file25k, twentyFiveK, TWENTY_FIVEK, qs);
                    System.out.println("The time results for Quick Sort " +
                            "25k are: ");
                    meanTime();
                    standardDeviation();

                    break;

                case 12: // Quick Sort 50K

                    runQuickSort(file50k, fiftyK, FIFTYK, qs);
                    System.out.println("The time results for Quick Sort " +
                            "50k are: ");
                    meanTime();
                    standardDeviation();

                    break;

                case 13: // Shell Sort 5K

                    runShellSort(file5k, fiveK, FIVEK, shs);
                    System.out.println("The time result for Shell Sort " +
                            "5k are: ");
                    meanTime();
                    standardDeviation();
                    break;

                case 14: // Shell Sort 10K

                    runShellSort(file10k, tenK, TENK, shs);
                    System.out.println("The time results for Shell Sort " +
                            "10k are: ");
                    meanTime();
                    standardDeviation();
                    break;

                case 15: // Shell Sort 25K

                    runShellSort(file25k, twentyFiveK, TWENTY_FIVEK, shs);
                    System.out.println("The time results for Shell Sort " +
                            "25k are: ");
                    meanTime();
                    standardDeviation();
                    break;

                case 16: // Shell Sort 50K

                    runShellSort(file50k, fiftyK, FIFTYK, shs);
                    System.out.println("The time results for Shell Sort " +
                            "50k are: ");
                    meanTime();
                    standardDeviation();
                    break;

            }
            System.out.println("0. Exit");
            System.out.println("01. Selection Sort 5k");
            System.out.println("02. Selection Sort 10k");
            System.out.println("03. Selection Sort 25k");
            System.out.println("04. Selection Sort 50k");
            System.out.println("05. Insertion Sort 5k");
            System.out.println("06. Insertion Sort 10k");
            System.out.println("07. Insertion Sort 25k");
            System.out.println("08. Insertion Sort 50k");
            System.out.println("09. Quick Sort 5k");
            System.out.println("10. Quick Sort 10k");
            System.out.println("11. Quick Sort 25k");
            System.out.println("12. Quick Sort 50k");
            System.out.println("13. Shell Sort 5k");
            System.out.println("14. Shell Sort 10k");
            System.out.println("15. Shell Sort 25k");
            System.out.println("16. Shell Sort 50k");
            System.out.print("Please select a sorting method: ");
            choice = validateNumber();
        }
    }

    /** Create a method that validates user input */
    private static int validateNumber() {
        int validNumber;
        while (!input.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            input.next();
        }
        validNumber = input.nextInt();
        return validNumber;
    }

    private static Integer[] readFile(File file, int size)
            throws FileNotFoundException {

        int index = 0;
        Scanner inputFile = new Scanner(file);
        Integer[] numberArray = new Integer[size];

        while (inputFile.hasNext()) {
            numberArray[index] = inputFile.nextInt();
            index++;
        }
        inputFile.close();;
        return numberArray;
    }

    private static void runSelectionSort(File file, Integer[] list, int size,
                                        DS07_SM_SelectionSort ss)
                                        throws FileNotFoundException {

        for (int i = 0; i < TEST_SIZE; i++) {
            list = readFile(file, size);
            startTime = System.currentTimeMillis();
            ss.selectionSort(list);
            endTime = System.currentTimeMillis();
            duration = (endTime - startTime);
            time[i] = (duration);
        }
    }

    private static void runInsertionSort(File file, Integer[] list, int size,
                                        DS07_SM_InsertionSort is)
                                        throws FileNotFoundException {

        for (int i = 0; i < TEST_SIZE; i++) {
            list = readFile(file, size);
            startTime = System.currentTimeMillis();
            is.insertionSort(list);
            endTime = System.currentTimeMillis();
            duration = (endTime - startTime);
            time[i] = (duration);
        }
    }

    private static void runQuickSort(File file, Integer[] list, int size,
                                        DS07_SM_QuickSort_2 qs)
            throws FileNotFoundException {

        int listSize = list.length;
        for (int i = 0; i < TEST_SIZE; i++) {
            list = readFile(file, size);
            startTime = System.currentTimeMillis();
            qs.quickSort(list, 0, listSize - 1);
            endTime = System.currentTimeMillis();
            duration = (endTime - startTime);
            time[i] = (duration);
        }
    }

    private static void runShellSort(File file, Integer[] list, int size,
                                        DS07_SM_ShellSort_2 shs)
            throws FileNotFoundException {

        for (int i = 0; i < TEST_SIZE; i++) {
            list = readFile(file, size);
            startTime = System.currentTimeMillis();
            shs.shellSort(list);
            endTime = System.currentTimeMillis();
            duration = (endTime - startTime);
            time[i] = (duration);
        }
    }

    private static void meanTime() {
        for (int i = 0; i < TEST_SIZE; i++) {
            sum += time[i];
            mean = (sum / TEST_SIZE);
        }
        System.out.println("Mean time is " + mean + " (in " +
                "milliseconds).");
    }

    private static void standardDeviation() {
        for (int i = 0; i < TEST_SIZE; i++) {
            variance += Math.pow(time[i] - mean, 2) / TEST_SIZE;
        }
        deviation = Math.sqrt(variance);
        System.out.println("Standard Deviation is " + deviation);
    }

}
