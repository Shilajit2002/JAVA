package LibraryManagementSystem;

class Admin{
    //  Instance Variables
    private String[] arr;
    private int top;

    //  Constructor
    public Admin() {
        arr=new String[10];
        top=0;
    }

    //  Mutator & Accessor Method
    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public int getTop() {
        return top;
    }

    // Increase the Size of the Array
    public void ensureCapacity(){
        if(top==arr.length){
            String temp[]= new String[top*2];
            for (int i = 0; i<top; i++){
                temp[i]=this.arr[i];
            }
            this.arr=temp;
        }
    }

    //  Add Book Method
    public boolean AddBook(String name){
        ensureCapacity();
        this.arr[top]=name;
        top++;
        return true;
    }

    //  ToString
    @Override
    public String toString() {
        String str = "Available Books = ";
        for (int i = 0; i < top; i++) {
            str += " || " + arr[i];
        }
        str+=" || ";
        return str;
    }
}
