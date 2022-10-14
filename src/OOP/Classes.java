package OOP;

public class Classes {
    public static void main(String[] args) {

        class Dog {
            String name;
            String color;
            int age;

            public void jump() {
                System.out.println("Jumping");

            }

            public void eat() {
                System.out.println("Eating");

            }

        }


        class Cat {
            String name;
            String color;
            double weight;

            public void jump() {
                System.out.println("Jumping");
            }

            public void play() {
                System.out.println("Playing");
            }

        }
        Dog d1=new Dog();
        d1.eat();

    }

}

