class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergeAlternately = new StringBuilder();
        //initalize vairables for iteration 
        int i = 0;
        int j = 0; 

        //create loop 
        while (i < word1.length() || j < word2.length()) {
            //check for characters left in word1 to process
            if (i < word1.length()) {
                //if true then retreive characters at index i from word1
                mergeAlternately.append(word1.charAt(i));
                //create increments 
                i++;
            }
            //check for charachters left in word2 to process
            if (j < word2.length()) {
                //if true then retreive charachters at index i from word2
                mergeAlternately.append(word2.charAt(j));
                //create increments 
                j++;
            }
        }
    //return the merged string
    return mergeAlternately.toString();
    }
    //create main method 
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        String merged = mergeAlternately(word1, word2);
        System.out.println("Merged String: " + merged);
    }
}