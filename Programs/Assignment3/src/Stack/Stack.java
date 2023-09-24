package Stack;

class Stack<T> {
    private T arr[];
    private int top;

    @SuppressWarnings("unchecked")

    //  Constructor
    public Stack() {
        //  Create Array Object of 10 size
        arr = (T[]) (new Object[10]);
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
        return true;
    }

    //  Push Method
    public boolean push(T value) {
        ensureCapacity();
        arr[top] = value;
        top++;
        return true;
    }

    //  Pop Method
    public boolean pop() {
        if (isEmpty()) {
            return false;
        } else {
            top--;
            return true;
        }
    }

    //  Peek Method
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return arr[top - 1];
        }
    }

    //  Increase the Stack Capacity by Doubling the size
    private void ensureCapacity() {
        if (top == arr.length) {
            T temp[] = (T[]) (new Object[top * 2]);
            for (int i = 0; i < top; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
    }

    //  To String Method for Display the Stack Elements
    public String toString() {
        if (isEmpty()) {
            return "\0";
        } else {
            String str = "";
            for (int i = top - 1; i >= 0; i--) {
                str += "|\t" + arr[i] + "\t|\n";
            }
            return str;
        }
    }
}
