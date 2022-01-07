package gb.algorithms.linkedlist.two.with.stack;

public class LinkedList {
    Link first;
    Link last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (this.first == null);
    }

    public void insert(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public Link delete() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    public Link find(String name) {
        Link current = first;
        while (current.name != name) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(String name) {
        Link current = first;
        Link previous = first;

        while (current.name != name) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Pavel", 8);
        list.insert("Misha", 10);
        list.insert("Vova", 30);
        list.insertLast("Petia", 15);
        list.display();
        System.out.println("deleted Vova list: ");
        list.delete("Vova");
        list.display();
    }
}
