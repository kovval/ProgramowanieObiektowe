package MyList;

/**
 * Created by RENT on 2017-09-07.
 */
public class MyList {
    private Element<T> _head;
    private Element<T> _tail;
    private int _counter;

    public Element getElementForward(T data) {
        Element<T> p = _head;
        while (p._next != null) {
            if (p._data == data) {
                break;
            }
            p = p._next;
        }
        return p;
    }

    public Element<T> getElementBackward(T data) {
        Element<T> p = _tail;
        while (p._prev == null) {
            if (p._data == data) {
                break;
            }
            p = p._prev;

        }
        return p;
    }

    public void printAllElements() {
        Element<T> p = _head;
        while (p != null) {
            System.out.println(p._data);
            p = p._next;
        }
    }

    public void addElementAtBeginning(T data) {
        Element p = new Element<T>();
        p._data = data;
        p._prev = null;
        p._next = _head;
        _head = p;
        _counter++;
        if (p._next != null) {
            p._next._prev = p;
        } else {
            _tail = p;
        }
    }

    public void addElementAtTail(T data) {
        Element p = new Element();
        p._data = data;
        p._next = null;
        p._prev = _tail;
        _tail = p;
        _counter++;
        if (p._prev != null) {
            p._prev._next = p;
        } else {
            _head = p;
        }
    }

    public void addElementAffter(T elementToAdd, T elementweWantToAddAfter) {
        Element after = getElementForward(elementweWantToAddAfter);
        if (after == _tail) {
            addElementAtTail(elementToAdd);
        } else {
            Element p = new Element();
            p._data = elementToAdd;
            p._prev = after;
            p._next = after._next;

//            Element nextAfter = after._next;
//            nextAfter._prev = p;
            p._next._prev = p._next;
            after._next = p;

        }


    }

    private class T {
    }
}

