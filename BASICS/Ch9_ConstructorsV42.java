package BASICS;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 50;
        name = "rituraj";
    }

    public String getName() { return name; }
    public void setName(String n) { this.name = n;}
    public void setId(int i) { this.id = i;}
    public int getId() { return id;}
}

public class Ch9_ConstructorsV42 {
    public static void main(String[] args) {
        MyMainEmployee ritu = new MyMainEmployee();
        ritu.setName("rituraj");
        ritu.getName();

        System.out.println(ritu.getId());
        System.out.println(ritu.getName());
        
    }
    
}
