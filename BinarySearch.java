static void BinarySearch(int[] arr, int item) {
    int left = 0;
    int right = arr.length - 1;
    boolean notFound = true;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == item) {
            System.out.println("Found item at index = " + mid);
            notFound = false;
            break;
        } else if (arr[mid] < item) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    if (notFound) {
        System.out.println("This item is not found!!");
    }
}
