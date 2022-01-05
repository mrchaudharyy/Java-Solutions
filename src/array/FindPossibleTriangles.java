package array;

public class FindPossibleTriangles {

    public static void main(String[] args) {
        int[] arr = {4, 3, 9, 8};
        int numberOfTriangles = findNumberOfTriangles(arr, arr.length);
        System.out.println("Possible triangles :: " + numberOfTriangles);
    }

    static int findNumberOfTriangles(int arr[], int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k]
                            && arr[i] + arr[k] > arr[j]
                            && arr[k] + arr[j] > arr[i]) {
                        count++;
                        System.out.println("Set : " + count + " : " + arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }

        return count;
    }
}
