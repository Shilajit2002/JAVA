package LinkedList;

class LinkedList {
    private int data;

    //  Inner Class Node
    class Node {
        private int data;
        private Node next;

        //  Constructor
        public Node(int data) {
            this.data = data;
            next = null;
        }

        //  Mutator Method
        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        //  Accessor Method
        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node head;

    //  Constructor
    public LinkedList() {
        this.head = null;
    }

    //  Insert Method
    public void insertData(int data) {
        Node new_node = new Node(data);
        //  Insert data at the Head of the list
        if (head == null) {
            head = new_node;
            System.out.println(data + " is Inserted the List");
        } else {
            Node last = head;
            while (last.getNext() != null) {
                //  Check the List Data is Duplicate or Not
                if (last.getData() == data) {
                    System.out.println("Same Data Not Allowed");
                    return;
                }
                last = last.getNext();
            }
            //  Check the last data is Duplicate or Not
            if (last.getData() == data) {
                System.out.println("Same Data Not Allowed");
            } else {
                last.setNext(new_node);
                System.out.println(data + " is Inserted the List");
            }
        }
    }

    //  Remove List Method
    public boolean removeData(int data) {
        Node prev = head;
        Node next = head;

        //  Check the List is Empty or Not
        if (head == null) {
            return false;
        } else {
            //  Remove Data from Head
            if (head.getData() == data) {
                head = head.getNext();
                return true;
            } else {
                while (next.getData() != data) {
                    prev = next;
                    next = next.getNext();

                    //  If the data not found then its goes to end of the list and points null
                    if (next == null) return false;
                }
                next = next.getNext();
                prev.setNext(next);
            }
            return true;
        }
    }

    //  Search Method
    public boolean search(int data) {
        Node S = head;

        //  Check the List is Empty or Not
        if (head == null) {
            return false;
        } else {
            while (S.getData() != data) {
                S = S.getNext();
                //  If the data not found then its goes to end of the list and points null
                if (S == null) return false;
            }
            return true;
        }
    }

    //  Display Method
    public void display() {
        Node temp = head;

        if (head == null) {
            System.out.println("No Element in the Linked List");
        } else {
            while (temp.getNext() != null) {
                System.out.print(temp.getData() + " -> ");
                temp = temp.getNext();
            }
            System.out.print(temp.getData() + "\n");
        }
    }
}

