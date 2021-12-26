package gb.algorithms.linkedlist.one;

import gb.algorithms.Person;

public class LinkedList<T> {

    private Link<T> first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(T link) {
        Link<T> l = new Link<>(link);
        l.setNext(first);
        this.first = l;
    }

    public Link<T> delete() {
        Link<T> temp = first;
        first = first.getNext();
        return temp;
    }

    public Link<T> delete(T t) {
        Link<T> deleteNode = new Link<>(t);
        Link<T> current = first;
        Link<T> previous = first;

        while (!current.getValue().equals(deleteNode.getValue())) {
            if (current.getNext() == null) {
                return null;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        if (current.equals(first)) {
            first = first.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        return deleteNode;
    }

    public void display() {
        Link<T> current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public T find(T searchNode) {
        Link<T> findNode = new Link<>(searchNode);
        Link<T> current = first;
        while (current != null) {
            if (current.getValue().equals(findNode.getValue())) {
                return findNode.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("Ivan");
        linkedList.insert("Maria");
        linkedList.insert("Vasiliy");
        linkedList.insert("Dmitry");
        linkedList.display();
        System.out.println("find: " + linkedList.find("Maria"));
        System.out.println("first deleted: ");
        linkedList.delete();
        linkedList.display();
        System.out.println("delete Vasiliy: " + linkedList.delete("Vasiliy").getValue());
        linkedList.display();

        System.out.println("class person: ");
        LinkedList<Person> list = new LinkedList<>();
        list.insert(new Person("Ivan", 19));
        list.insert(new Person("Maria", 20));
        System.out.println("find: " + list.find(new Person("Maria", 20)).toString());
        list.delete(new Person("Maria", 20));
        list.display();
    }
}
