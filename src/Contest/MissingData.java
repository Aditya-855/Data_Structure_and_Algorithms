package Contest;

import java.util.Scanner;

public class MissingData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the sent and received strings
        String sent = scanner.nextLine();
        String received = scanner.nextLine();

        StringBuilder missing = new StringBuilder();
        int j = 0; // Index for received string

        // Loop through each character in the sent string
        for (int i = 0; i < sent.length(); i++) {
            if (j < received.length() && sent.charAt(i) == received.charAt(j)) {
                // If characters match, move to next character in received
                j++;
            } else {
                // If characters don't match, it's missing
                missing.append(sent.charAt(i));
            }
        }

        // Print the missing characters
        System.out.println(missing.toString());
    }
}

