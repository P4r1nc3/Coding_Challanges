package CodeWars.RangeExtractions;

class RangeExtractions {
    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int start = arr[i];
            result.append(start);

            int count = 1;
            while (i < n - 1 && arr[i + 1] - arr[i] == 1) {
                count++;
                i++;
            }

            if (count >= 3) {
                result.append("-").append(arr[i]);
            } else if (count == 2) {
                result.append(",").append(arr[i]);
            }

            if (i < n - 1) {
                result.append(",");
            }
        }

        return result.toString();
    }
}
