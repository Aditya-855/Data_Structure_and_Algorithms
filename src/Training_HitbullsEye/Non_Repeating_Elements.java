package Training_HitbullsEye;

public class Non_Repeating_Elements {
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
            if (count==1){
                System.out.println("Non Repeating Elements in The Array are: "+arr[i]);
            }
        }
    }
}
