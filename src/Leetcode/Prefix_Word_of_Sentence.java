package Leetcode;

public class Prefix_Word_of_Sentence {
    public static void main(String[] args) {
        String sentence="i love eating burger";
        String searchword="burg";
        System.out.println(isPrefixOfWord(sentence,searchword));
    }
        public static int isPrefixOfWord(String sentence, String searchWord) {
            String[] sentences=sentence.split(" ");
            for(int i=0;i<sentences.length;i++){
                if(sentences[i].startsWith(searchWord)) return i+1;
            }
            return -1;
        }
    }
