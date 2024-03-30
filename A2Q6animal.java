/*Write a program to create an Animal class with member variables name,color, types (pet/wild). Override the hashCode method to print the
unique id for the object. Create the objects of the Animal class and print its hashcode*/


public class A2Q6animal {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal lion = new Animal("Lion", "Golden", "Wild");
        System.out.println("Hash code of dog: " + dog.hashCode());
        System.out.println("Hash code of lion: " + lion.hashCode());
    }
}

class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
}
