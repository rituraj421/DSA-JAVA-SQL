package BASICS;

class MyMainEmployee01{
    private int id;
    private String name;

    public MyMainEmployee01(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee01(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee01(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class constructors1 {
    public static void main(String[] args) {
        //MyMainEmployee01 harry = new MyMainEmployee01("ProgrammingWithHarry", 12);
        MyMainEmployee01 harry = new MyMainEmployee01();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}

