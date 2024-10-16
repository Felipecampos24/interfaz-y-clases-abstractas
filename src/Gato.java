class Gato extends Animal implements mascota{

    Gato(String name) {
        super(name);
    }

    @Override
    void hacerruido() {
        System.out.println("Meow!");
    }

    @Override
    public void jugar() {
        System.out.println(name + " esta jugando con un raton.");
    }
}
