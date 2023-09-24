public class Getter_Setter {
    //  Instance Variables
    public int value;

    //  Getter Method(Accessor Method)
    public int getValue() {
        return value;
    }

    //  Setter Method(Mutator Method)
    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Getter_Setter G = new Getter_Setter();

        G.setValue(100);

        System.out.println(G.getValue());
    }
}
