package InheritanceDemo;

class Animal2
{
    void eat()
    {
        System.out.println("eat");
    }
}

class Mamal extends Animal2
{
    void walk()
    {
        System.out.println("walk");
    }
}

class Reptile extends Animal2
{
    void crawl()
    {
        System.out.println("crawl");
    }
}

class Tiger extends Mamal
{
    void roar()
    {
        System.out.println("roar");
    }
}


public class TestHybridInheritance {

    public static void main(String[] args) {

        Animal2 a = new Animal2();
        a.eat();

        Mamal m = new Mamal();
        m.eat();
        m.walk();

        Reptile r = new Reptile();
        r.eat();
        r.crawl();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();


    }
}
