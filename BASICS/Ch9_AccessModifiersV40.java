package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void SetName(String n){
        name = n;
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class Ch9_AccessModifiersV40 {
    public static void main(String[] args) {

        MyEmployee ritu = new MyEmployee();
        //ritu.id = 48;
        //ritu.name = "rituraj"; --throws error due to private access 
        ritu.setId = 33;
        ritu.setName("rituraj");
        System.out.println(ritu.getName());
        System.out.println(ritu.getId());

        
    }
    
}
