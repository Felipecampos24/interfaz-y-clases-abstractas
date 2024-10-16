class Perro extends Animal implements mascota {

    Perro(String name) {
        super(name);
    }

    @Override
    void hacerruido() {
        System.out.println("guaf!");
    }

    @Override
    public void jugar() {
        System.out.println(name + " esta jugando con una pelota");
    }
}
