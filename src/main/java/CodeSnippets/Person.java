package CodeSnippets;

public class Person implements details {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getInfo() {
        System.out.printf("%s : %4d", getName(), getId());
    }

    public static void main(String[] args) {
        Person aPerson = new Person("Sam", 1);
        aPerson.getInfo();
    }
}
