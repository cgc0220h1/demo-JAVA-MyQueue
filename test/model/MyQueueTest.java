package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    private MyQueue<String> listString;

    @BeforeEach
    void createNewQueue() {
        listString = new MyQueue<>();
    }

    @Test
    void enqueue() {
        listString.enqueue(new String("a"));
        listString.enqueue(new String("b"));
        listString.enqueue(new String("c"));
        listString.enqueue(new String("d"));
        String actualHead = listString.getHead().getData();
        String actualTail = listString.getTail().getData();
        String actualIndex2 = listString.get(2).getData();
        int expectedSize = 4;
        assertEquals("a",actualHead);
        assertEquals("d",actualTail);
        assertEquals("c",actualIndex2);
        assertEquals(expectedSize,listString.size());
    }

    @Test
    void dequeue() {
        listString.enqueue(new String("a"));
        listString.enqueue(new String("b"));
        listString.enqueue(new String("c"));
        listString.enqueue(new String("d"));
        String expectedString = listString.getHead().getData();
        String actualString = listString.dequeue().getData();
        assertEquals(expectedString, actualString);
    }
}