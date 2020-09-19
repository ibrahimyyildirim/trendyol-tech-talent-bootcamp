package trendyolBootcampTestHw;

import java.util.HashSet;

public class uniqueWords {
    public Integer wordCount(String inputWords) {

        String words  = inputWords.toLowerCase().replaceAll("[^a-z\\s]+(\"\")","");
        String[] modifiedWords = words.split(" ");

        if(inputWords.isEmpty()){
           return 0;
        }

        HashSet<String> set = new HashSet<>();

        for (String word: modifiedWords){
            set.add(word);
        }

        return set.size();
    }
}
