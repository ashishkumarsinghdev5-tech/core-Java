package InterviewQuestionJava;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency
    // Print Characters with Frequency > 4
{
    public static void main(String[] args)
    {
        String str = "AAAABBBBCCCCCC";
        // This is the raw data you want to analyze.
        // Use HashMap to store character frequencies
        Map<Character,Integer> freqMap = new HashMap<>();
        // Keys = characters (Character), Values = how many times that character appeared (Integer).
        for (char ch : str.toCharArray())
        // toCharArray() converts the string to a char[]. The loop visits every character once.
        {
            freqMap.put(ch ,freqMap.getOrDefault(ch,0) +1);
            //getOrDefault(ch, 0) returns the current count if present or 0 if absent.
            //Then you add 1 and put the new value back into the map.
            //Example result for "AAAABBBBCCCCCC":
            //A -> 4, B -> 4, C -> 6
        }
        // Print only characters with frequency > 4
        System.out.println("Characters with frequency > 4:");
        freqMap.entrySet().stream()
                //entrySet() gives pairs (char, count). The stream filters down to only those where count > 4.
                .filter(entry -> entry.getValue() > 4)
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue())
                );
    }
}
