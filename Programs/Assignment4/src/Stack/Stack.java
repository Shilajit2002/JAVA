package Stack;

class Stack<T> {
    private T arr[];
    private int top;

    @SuppressWarnings("unchecked")

    //  Constructor
    public Stack() {
        //  Create Array Object of 5 size
        arr = (T[]) (new Object[5]);
        top = 0;
    }

    //  Is Empty Method
    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    //  Is Full Method
    public boolean isFull() {
        if (top == arr.length) {
            return true;
        }
        return false;
    }

    //  Push Method
    public boolean push(T value) {
        if (isFull()) {
            throw new FullStackException("Full Stack Exception");
        }
        arr[top] = value;
        top++;
        return true;
    }

    //  Pop Method
    public boolean pop() {
        if (isEmpty()) {
            throw new EmptyStackException("Empty Stack Exception");
        } else {
            top--;
            return true;
        }
    }

    //  Peek Method
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException("Empty Stack Exception");
        } else {
            return arr[top - 1];
        }
    }

    //  To String Method for Display the Stack Elements
    public String toString() {
        if (isEmpty()) {
            throw new EmptyStackException("Empty Stack Exception");
        } else {
            String str = "";
            for (int i = top - 1; i >= 0; i--) {
                str += "|\t" + arr[i] + "\t|\n";
            }
            return str;
        }
    }
}
