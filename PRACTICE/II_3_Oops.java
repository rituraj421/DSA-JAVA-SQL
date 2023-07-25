package PRACTICE;

class ritu {
    private int id;
    private String name;

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

public class II_3_Oops {
    public static void main(String[] args) {
        ritu r1 = new ritu();
        r1.setName("rituraj");
        r1.setId(3);
        System.out.println(r1.getName());
        System.out.println(r1.getId());
    }
}
