public class Animal {
    // Fields (Instance Variables)
    private String name;
    private double height;
    private int weight;
    private String sound;

    // Getter = Accessors | Setter = Mutators

    public void setName(String newName){name = newName;}
    public String getName(){return name;}

    // Encapsulation
    public void setWeight(int newWeight){ // int newWeight is Parameter
        if(newWeight > 0){
            weight=newWeight;
        }else{
            System.out.println("Weight must be bigger than 0");
        }
    }
    public int getWeight(){return weight;}

    public void setSound(String newSound){sound = newSound;}
    public String getSound(){return sound;}

}