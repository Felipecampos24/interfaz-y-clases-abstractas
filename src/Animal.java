abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void hacerruido();

    void printName() {
        System.out.println("Animal: " + name);
    }
}