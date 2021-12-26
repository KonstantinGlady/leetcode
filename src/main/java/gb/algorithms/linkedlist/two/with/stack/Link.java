package gb.algorithms.linkedlist.two.with.stack;

public class Link {

    String name;
    int age;
    Link next;

    public Link(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("name: " + name + " age: " + age);
    }
}
