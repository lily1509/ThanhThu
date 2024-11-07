import searchalgorithm.BinarySearch;
import searchalgorithm.LinearSearch;
import sortalgorithm.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int arrayLength = scanner.nextInt();

        // Khởi tạo mảng
        int[] arrayInput = new int[arrayLength];

        // Nhập các phần tử của mảng từ bàn phím
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            arrayInput[i] = scanner.nextInt();
        }

        System.out.print("Nhập giá trị cần tìm: ");
        int key = scanner.nextInt();
        callMeForLinearSearch(arrayInput, key);
        scanner.close();
    }
    // callMeForMergeSort(arrayInput);
    // scanner.close();

    static void callMeForBinarySearch(int[] arrayInput, int key) {
        // Giả sử BinarySearch.binarySearch trả về chỉ số hoặc -1 nếu không tìm thấy
        int result = BinarySearch.binarySearch(arrayInput, key);
        if (result != -1) {
            System.out.println("Giá trị được tìm thấy tại vị trí: " + result);
        } else {
            System.out.println("Giá trị không có trong mảng.");
        }
    }

    static void callMeForLinearSearch(int[] arrayInput, int key) {
        LinearSearch linearSearchInstance = new LinearSearch();
        // Giả sử LinearSearch.linearSearch trả về chỉ số hoặc -1 nếu không tìm thấy
        int result = linearSearchInstance.linearSearch(arrayInput, key);
        if (result != -1) {
            System.out.println("Vị trí của phần tử cần tìm là: " + result);
        } else {
            System.out.println("Giá trị không có trong mảng.");
        }
    }

    static void callMeForSelectionSort(int[] arrayInput) {
        SelectionSort selectionSortInstance = new SelectionSort();
        System.out.println("Mảng trước khi sắp xếp là:");
        printArray(arrayInput);
        selectionSortInstance.selectionSort(arrayInput);
        System.out.println("Mảng sau khi sắp xếp là:");
        printArray(arrayInput);
    }

    static void callMeForInsertionSort(int[] arrayInput) {
        InsertionSort insertionSortInstance = new InsertionSort();
        System.out.println("Mảng trước khi sắp xếp là:");
        printArray(arrayInput);
        insertionSortInstance.insertionSort(arrayInput);
        System.out.println("Mảng sau khi sắp xếp từ bé đến lớn:");
        printArray(arrayInput);

        // Nếu có phương thức sắp xếp giảm dần
        insertionSortInstance.insertionSortDescending(arrayInput);
        System.out.println("Mảng sau khi sắp xếp từ lớn đến bé:");
        printArray(arrayInput);
    }

    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
