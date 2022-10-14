package OOP;

public class Textbox {
    String text;
    int length;

    public void setText(String text) {
        this.text=text;

    }
    public void clear() {
        this.text=" ";

    }
    public String getText(){
        return text;
    }

}
