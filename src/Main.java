//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Buddy");
        Gato gato = new Gato("Simba");

        perro.printName();
        perro.hacerruido();
        perro.jugar();

        gato.printName();
        gato.hacerruido();
        gato.jugar();
    }
}
