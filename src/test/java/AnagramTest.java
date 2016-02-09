import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AnagramTest {
  @Test
  public void isAnagram_WillReturnFalseIfNotAnagram() {
    Anagram testAnagram = new Anagram();
    assertEquals(false, testAnagram.isAnagram("cat", "doggy"));
  }

  @Test
  public void isAnagram_WillReturnTrueIfAnagram() {
    Anagram testAnagram = new Anagram();
    assertEquals(true, testAnagram.isAnagram("cat", "tac"));
  }
}
