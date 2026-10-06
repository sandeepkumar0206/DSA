import java.util.*;
class Solution {
    public String sortVowels(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> firstOccurrence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                firstOccurrence.putIfAbsent(ch, i);
            }
        }
        List<Character> vowelsInString = new ArrayList<>(freq.keySet());
        vowelsInString.sort((a, b) -> {
            int freqCompare = Integer.compare(freq.get(b), freq.get(a)); 
            if (freqCompare != 0) {
                return freqCompare;
            }
            return Integer.compare(firstOccurrence.get(a), firstOccurrence.get(b)); 
        });
        
        List<Character> sortedVowels = new ArrayList<>();
        for (char v : vowelsInString) {
            int count = freq.get(v);
            for (int i = 0; i < count; i++) {
                sortedVowels.add(v);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int vowelIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                sb.append(sortedVowels.get(vowelIndex++));
            } else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
    
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}