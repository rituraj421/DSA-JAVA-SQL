package BASICS;

class bannu{
   private int id;
   private String name;
   
   public String getName(){
    return name;
   }

   public void setName(String n){
    name = n;
   }

   public void setId(int i){
    id = i;
   }

   public int getId(){
    return id;
   }

}


public class accessModifiers {
    public static void main(String[] args) {  

        bannu rituraj  = new bannu();
        // rituraj.id = 21;
        // rituraj.name = "rituraj";

        rituraj.setName("rituraj");
        System.out.println(rituraj.getName());
    }
}