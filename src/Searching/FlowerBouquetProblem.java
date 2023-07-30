package Searching;

public class FlowerBouquetProblem {
    // ... (Previous code shown above)

    public static void main(String[] args) {
        // Flower bouquet problem
        int[] flowerArr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 6, 7, 8, 8, 9, 8, 7, 6};
        int adjacentFlowers =3 ;
        int noOfBouquets = 5;

        int minDaysRequired = findMinimumDays(flowerArr, noOfBouquets, adjacentFlowers);
        System.out.println("Minimum number of days required: " + minDaysRequired);
    }

    // Function to find the minimum number of days required to make M bouquets
    static int findMinimumDays(int[] flowerArr, int m, int adjacentFlowers) {
        if (flowerArr.length < m * adjacentFlowers) {
            // Not enough flowers to make the required number of bouquets
            return -1;
        }

        // Find the minimum and maximum days in the flower array
        int[] minMax = findMinMax(flowerArr);
        int minDay = minMax[0];
        int maxDay = minMax[1];

        // Perform binary search to find the minimum days
        while (minDay <= maxDay) {
            int mid = minDay + (maxDay - minDay) / 2;
            if (isPossibleToMakeBouquets(flowerArr, mid, m, adjacentFlowers)) {
                maxDay = mid-1;
            } else {
                minDay = mid + 1;
            }
        }

        return minDay;
    }

    // Function to check if it is possible to make M bouquets with K adjacent flowers using a given day
    static boolean isPossibleToMakeBouquets(int[] flowerArr, int day, int m, int k) {
        int count = 0;
        int noOfBouquets = 0;

        // Iterate through the flower array and count the number of adjacent flowers less than or equal to 'day'
        for (int i = 0; i < flowerArr.length; i++) {
            if (flowerArr[i] <= day) {
                count++;
            } else {
                // Calculate the number of bouquets that can be made with 'count' adjacent flowers
                noOfBouquets += count / k;
                count = 0;
            }
        }

        // Add the bouquets that can be made with the remaining adjacent flowers
        noOfBouquets += count / k;

        // Return true if the required number of bouquets can be made with the given day
        return noOfBouquets >= m;
    }

    // Function to find the minimum and maximum element in the array
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        }

        int minElement = arr[0];
        int maxElement = arr[0];

        // Iterate through the array to find the minimum and maximum elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            } else if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return new int[]{minElement, maxElement};
    }
}
