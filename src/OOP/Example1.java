package OOP;

public class Example1 {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(new Car().name);

        Textbox t1 =new Textbox();
        t1.setText("Stereo heart");
        System.out.println(t1.text);

        t1.clear();
        System.out.println("null"+t1.text);

        t1.setText("My heart's a stereo");
        t1.getText();
        System.out.println(t1.text);

    }
}
//instance>>object>>reference