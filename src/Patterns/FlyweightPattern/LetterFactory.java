import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, Iletter> letterMap = new HashMap<Character, Iletter>();
    public static Iletter createLetter(char charValue){
        if(letterMap.containsKey(charValue)){
            System.out.println("Character already exists" + charValue);
            return letterMap.get(charValue);
        }else{
            Iletter letter = new DocumentCharacter(charValue, 12, "Arial");
            letterMap.put(charValue, letter);
            return letter;
        }
    }

    
}
