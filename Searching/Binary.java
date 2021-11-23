
class Binary{
    int binarySearch(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
 
    public static void main(String args[])
    {
        Binary object = new Binary();
        int arr[] = { 0, 1, 2, 3, 10};
        int n = arr.length;
        int key = 10;
        int result = object.binarySearch(arr, key);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}

