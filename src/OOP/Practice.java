package OOP;

public class Practice {
    public Practice() {
    }

    public static void main(String[] args) {

        class A {
            int a;
            String b;
        }

        class B extends A {
            public void show() {
                System.out.println("This is class C");
            }
        }

        class C extends B {

        }
    C obj=new C();
        obj.a=2;
        System.out.println(obj.a);
        obj.b="Hello";
        System.out.println(obj.b);
        obj.show();

    }
}

//multiple inheritance
