package Training_HitbullsEye;

public class Frequency_Of_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 6, 2, 8, 2};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Frequency of Number "+arr[i]+" is: "+count);
        }
    }
}
