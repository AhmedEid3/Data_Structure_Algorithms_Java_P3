package utils;

import java.util.*;

public class StringUtils {
    public static int count(String str) {
        if (str == null) return 0;

        int count = 0;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('o');
        vowels.add('i');
        vowels.add('u');

        for (var ch : str.toLowerCase().toCharArray()
        ) {
            if (vowels.contains(ch)) count++;
        }

        return count;
    }

    public static String reverse(String str) {
        if (str == null) return "";

        StringBuilder out = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            out.append(str.charAt(i));
        }

        return out.toString();
    }

    public static String reverseWords(String str) {
        if (str == null) return "";

        String[] chars = str.trim().split(" ");
        Collections.reverse(Arrays.asList(chars));
        return String.join(" ", chars);
    }

    public static String removeDuplication(String str) {
        if (str == null) return "";

        Set<Character> uniqueStr = new HashSet<>();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!uniqueStr.contains(str.charAt(i))) {
                uniqueStr.add(str.charAt(i));
                out.append(str.charAt(i));
            }
        }

        return out.toString();
    }

    public static String findMostRepeatedChar(String str) {
        if (str == null) return "";

        Map<Character, Integer> mapStr = new HashMap<>();
        String mostRepeated = "";
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!mapStr.containsKey(str.charAt(i)))
                mapStr.put(str.charAt(i), 1);
            else {
                mapStr.put(str.charAt(i), mapStr.get(str.charAt(i)) + 1);
            }

            if (mapStr.get(str.charAt(i)) > max) {
                max = mapStr.get(str.charAt(i));
                mostRepeated = String.valueOf(str.charAt(i));
            }
        }


        return mostRepeated;
    }

    public static String toCapitalize(String str) {
        if (str == null || str.trim().isEmpty()) return "";

        String[] words = str.trim()
                .replaceAll(" +", " ").split(" ");

        for (int i = 0; i < words.length; i++
        ) {
            words[i] = words[i].substring(0, 1).toUpperCase() +
                    words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

    public static boolean isAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) return false;

        var strArray1 = str1.toCharArray();
        Arrays.sort(strArray1);

        var strArray2 = str2.toCharArray();
        Arrays.sort(strArray2);

        return Arrays.equals(strArray1, strArray2);
    }

    public static boolean isAnagramsByHistogramming(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) return false;

        int ALPHABET_SIZE = 26;
        int[] chars = new int[ALPHABET_SIZE];

        for (int i = 0; i < str1.length(); i++) {
            chars[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            var index = str2.charAt(i) - 'a';
            if (chars[index] == 0) return false;
            chars[index]--;
        }

        return true;
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            var start = str.charAt(i);
            var end = str.charAt(str.length() - i - 1);
            if (start != end) return false;
        }

        return true;
    }

    public static boolean areRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) return false;

        return (str1 + str1).contains(str2);
    }
}
