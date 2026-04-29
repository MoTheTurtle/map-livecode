import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
  public static void main(String[] args) {
    /*notes
    key, value
    List is the interface, Map then i the interface. 




    */


   List<Integer> nums = new ArrayList<>();

    Map<String, String> schools = new HashMap<>();
    schools.put("Auberon", "GRC"); 
    schools.put("Damien","OSU");
    schools.put("Xinting", "UW");
    schools.put("Tina","GRC");

   // schools.put("Damien","CPH");
    
   // System.out.println(schools.get("Xinting"));
    
    Map<String,Integer> scores = new HashMap<>();

    scores.put("Nupur", 345);
    scores.put("Alex",120);
    scores.put("Stace",67);

    //System.out.println(scores.get("Stace")); 
    int oldScore = scores.get("Stace");
    int newScore = oldScore + 10; 
    scores.put("Stace",newScore);


    //System.out.println(schools);

    String[] words = {"Yes", "I" , "Will", "Yes", "I" , "Yes", "said"};
    Map<String,Integer> joyceCount = countMap(words);
    System.out.println(joyceCount); 
    //System.out.println(countMap(words));

    for(String word:joyceCount.keySet()){
      System.out.println(word);
    }

  }
  //return a map that counts how many times each word shows up in the array
  //example:[ yes, i , will, yes, i said, yes]
  // yes:3
  //i:2
  //will:1

  public static Map<String, Integer> countMap(String[] words){
    //counts = {}
    //for word in words:
    // if word in map:
    //    NewCount = count.get(word);
    //    NewCount++
    //    counts.put(word, NewCount)
    //  else
    // count.put(word, 1)
    // return counts
  Map<String,Integer> counts = new HashMap<>();
  for(String word:words){
    if(counts.containsKey(word)){
      int OldCount = counts.get(word); 
      int NewCount = OldCount+1;
      counts.put(word,NewCount); 
    }
    else{
      counts.put(word,1);
    }
  }
  return counts; 
  }
}