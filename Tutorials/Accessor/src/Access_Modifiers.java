public class Access_Modifiers {
    //  Private Access Modifier
    private int a;
    //  Public Access Modifier
    public int b;
    //  Protected Access Modifier
    protected int c;
    //  Default Access Modifier
    int d;

    public static void main(String[] args) {
        Access_Modifiers A=new Access_Modifiers();
        System.out.println(A.a +" "+ A.b +" "+ A.c +" "+ A.d);
    }
}
