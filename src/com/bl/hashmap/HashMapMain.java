package com.bl.hashmap;

public class HashMapMain {
    public static void main(String[] args) {
       // String sentence = "to be or not to be";
        IHashMap<String,Integer> hashMap = new HashMap<>();
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.toLowerCase().split( " ");
        for(String word: words) {
            Integer value = hashMap.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;
            hashMap.put(word, value);
        }
//        int frequency = hashMap.get("to");
//        System.out.println(frequency);
        hashMap.remove("avoidable");gir
        System.out.println(hashMap);
    }
}
