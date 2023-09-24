package LibraryManagementSystem;

import java.util.Objects;

class User extends Admin{
    //  Instance Variable
    private String[] IssueArr;
    private int IssueTop;

    //  Constructor
    public User() {
        IssueArr=new String[1];
        IssueTop=0;
    }

    //  Mutator & Accessor Method
    public String[] getIssueArr() {
        return IssueArr;
    }

    public void setIssueArr(String[] issueArr) {
        IssueArr = issueArr;
    }

    public int getIssueTop() {
        return IssueTop;
    }

    // Increase the Size of the Array
    public void ensureCapacity(){
        if(IssueTop==IssueArr.length){
            String temp[]= new String[IssueTop*2];
            for (int i = 0; i<IssueTop; i++){
                temp[i]=this.IssueArr[i];
            }
            this.IssueArr=temp;
        }
    }

    //  IssueBook Method
    public boolean IssueBook(String name){
        for (String val : super.getArr()) {
            if(Objects.equals(val, name))
            {
                ensureCapacity();
                IssueArr[IssueTop]=name;
                IssueTop++;
                return true;
            }
        }
        return false;
    }

    //  Return Book
    public boolean ReturnBook(String name){
        for (int i = 0; i < IssueTop; i++) {
            if(Objects.equals(IssueArr[i], name)){
                for (int j = i; j < IssueTop-1; j++) {
                    IssueArr[j]=IssueArr[j+1];
                }
                IssueTop--;
                return true;
            }
        }
        return false;
    }

    //  Show Available Books
    public void Available(){
        System.out.println(super.toString());
    }

    //  ToString
    @Override
    public String toString() {
        String str = "Issued Books = ";
        for (int i = 0; i < IssueTop; i++) {
            str += " || " + IssueArr[i];
        }
        str+=" || ";
        return str;
    }
}