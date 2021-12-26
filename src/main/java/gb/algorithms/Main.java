package gb.algorithms;

public class Main {
    public static void main(String[] args) {
        //примитивные типы при передаче как параметр не передаются а создают копию sout вернет 5
        int n = 5;
        changeNumber(n);
        System.out.println(n);

        // ссылочные при передаче передают ссылку на адресс памяти, а не само значение. Изменение будет
        Person person = new Person("Dmitry");
        changeName(person);
        System.out.println(person);

        //при вызове оператора new создается новый объект. если не переопределить equals вернется false
        Person a = new Person("Artem");
        Person b = new Person("Artem");
        System.out.println(a.equals(b));
    }

    private static void changeName(Person person) {
       person.setName("Ivan");
    }

    private static void changeNumber(int n) {
        n = 10;
    }
}
