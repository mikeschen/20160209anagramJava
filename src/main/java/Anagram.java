import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
  }

  public static Boolean isAnagram(String word1, String word2) {
    char[] word1Array = word1.toLowerCase().toCharArray();
    char[] word2Array = word2.toLowerCase().toCharArray();
    Arrays.sort(word1Array);
    Arrays.sort(word2Array);
    if (Arrays.equals(word1Array, word2Array)) {
      return true;
    } else {
      return false;
    }
  }
}
