package PRACTICE;

class raj {
    private int id;
    private String name;

    public raj(String myName) {
        id = 34;
        name = myName;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class II_4_oops {
    public static void main(String[] args) {
        raj r1 = new raj("raj");
        System.out.println(r1.getId());
        System.out.println(r1.getName());
    }
}
