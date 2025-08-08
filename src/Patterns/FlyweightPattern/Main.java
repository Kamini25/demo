public class Main {
    public static void main(String[] args) {
        Iletter ob = LetterFactory.createLetter('a');
        ob.writeLetter(1, 2);
        Iletter ob1 = LetterFactory.createLetter('a');
        ob1.writeLetter(1, 3);
    }
}
