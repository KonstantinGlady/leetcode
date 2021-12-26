package gb.algorithms.linkedlist.two.with.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("checking working linkedList")
class LinkedListTest {

    private LinkedList list;

    @BeforeEach
    void setup() {
        list = new LinkedList();
    }

    @DisplayName("inserted first item")
    @Test
    void insertFirst() {
        list.insert("Ivan", 9);
        assertAll("inserted Ivan",
                () -> assertFalse(list.isEmpty()),
                () -> assertSame("Ivan", list.first.name),
                () -> assertSame("Ivan", list.last.name),
                () -> assertSame(9, list.first.age)
        );
    }
}