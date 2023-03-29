import utils.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(StringUtils.count(null));
        System.out.println(StringUtils.reverse("Ahmed"));
        System.out.println("'" + StringUtils.reverseWords("  Ahmed Eid  ") + "'");
        System.out.println(StringUtils.removeDuplication("Hellooo!!"));
        System.out.println(StringUtils.findMostRepeatedChar("Helllooo!!!!!!!"));
        System.out.println("'" + StringUtils.toCapitalize("     ") + "'");
        System.out.println(StringUtils.isAnagrams("a", ""));
        System.out.println(StringUtils.isAnagramsByHistogramming("", ""));
        System.out.println(StringUtils.isPalindrome("abdcdba"));
        System.out.println(StringUtils.areRotation("abcd", "bcad"));
    }
}