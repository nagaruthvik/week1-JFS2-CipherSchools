package Cipherschool;

public class Inheritance {
    int width;
    int height;
    void display(String item){
        System.out.println(item+" WIDTH "+width+" HEIGHT "+height);
    }
    public static void main(String[] args){
        Chair neelkamal = new Chair();
        neelkamal.foo();
        Table ikea = new Table();
        ikea.foo();
    }
}
class Chair extends Inheritance{
    void foo(){width=10;height=20;display("Chair");}
}
class Table extends Inheritance{
    void foo(){width=50;height=100;display("Table");}
}
class Almira extends Inheritance{
    void foo(){width=100;height=200;display("Almira");}
}
