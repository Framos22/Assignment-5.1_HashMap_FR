import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * A Dictionary class that loads word-definition pairs into a HashMap.
 */
public class Dictionary {
    private HashMap<String, String> dictionary;

    // Constructor initializes the HashMap
    public Dictionary() {
        dictionary = new HashMap<>();
    }

    /**
     * Loads the dictionary from a file.
     *
     * @param filePath Path to the dictionary file (in CSV format).
     */
    public void loadDictionary(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t"); // Splitting by tab, assuming a tab-delimited file
                if (parts.length == 2) {
                    dictionary.put(parts[0], parts[1]); // Add word and definition to the HashMap
                }
            }
            System.out.println("Dictionary loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading dictionary: " + e.getMessage());
        }
    }

    /**
     * Prints all words and definitions in the dictionary.
     */
    public void printDictionary() {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println("Word: " + entry.getKey() + "\nDefinition: " + entry.getValue());
        }
    }

    /**
     * Searches for a word in the dictionary and prints its definition and hash key.
     *
     * @param word Word to search for.
     */
    public void searchWord(String word) {
        if (dictionary.containsKey(word)) {
            System.out.println("Word: " + word);
            System.out.println("Definition: " + dictionary.get(word));
            System.out.println("Hash Key: " + word.hashCode());
        } else {
            System.out.println("Word not found: " + word);
        }
    }
}
