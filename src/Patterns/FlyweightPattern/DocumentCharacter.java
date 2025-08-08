public class DocumentCharacter implements  Iletter {
    public char character; // intrinsic field
    public int fontSize;    
    public String fontType;
    
    DocumentCharacter(char character, int fontSize, String fontType) {
        this.character = character;
        this.fontSize = fontSize;
        this.fontType = fontType;
    }
@Override
    public void writeLetter(int row, int col) {
        System.out.println("Writing character: " + character + " at row: " + row + " and col: " + col);
    }
}
