public class Application {
    public static void main(String[] args) {
        // Create a new Dictionary object
        Dictionary myDictionary = new Dictionary();
        
        // Load dictionary from the provided file (adjust the path as needed)
        String filePath = "DictionaryWordValuePairs.txt"; // Use the correct path to the file
        myDictionary.loadDictionary(filePath);

        // Print the dictionary
        System.out.println("Printing the Dictionary:");
        myDictionary.printDictionary();

        // Search for several words
        System.out.println("\nSearching for specific words:");
        myDictionary.searchWord("appetency");
        myDictionary.searchWord("cordwainer");
        myDictionary.searchWord("repulsive");
        myDictionary.searchWord("virtue");
        myDictionary.searchWord("shrift");
    }
}
