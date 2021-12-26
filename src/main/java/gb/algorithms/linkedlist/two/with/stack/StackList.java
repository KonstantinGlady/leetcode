package gb.algorithms.linkedlist.two.with.stack;

public class StackList {
    LinkedList list;

    public StackList() {
        this.list = new LinkedList();
    }

    public void push(String name, int age) {
        list.insert(name, age);
    }

    public String pop() {
        return list.delete().name;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }

    public static void main(String[] args) {
        StackList stackList = new StackList();
        stackList.push("Ivan", 9);
        stackList.push("Maria", 29);
        stackList.push("Boris", 39);
        stackList.display();
        System.out.println("deleting: ");
        while (!stackList.isEmpty()) {
            System.out.println("name: " + stackList.pop());
        }
    }
}
