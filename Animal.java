public abstract class Animal {
    private int age;
    private String name;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void speak();
}
