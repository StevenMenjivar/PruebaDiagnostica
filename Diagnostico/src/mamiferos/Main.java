package mamiferos;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        //Objetos de mamíferos
        mamiferos[0] = new Tigre("Selva", 1f, 1f, 250, "Panthera tigris", 2.5f, 55, "Sumatra");
        mamiferos[1] = new Leon("Selva", 1, 1, 200, "Leoncio", 5.5f, 42, 2,700);
        mamiferos[3] = new Guepardo("Selva", 1, 1, 200, "Guepardi", 4.5f, 60);
        mamiferos[4] = new Lobo("Selva", 1, 1, 200, "Lobitus", "blanco", 4.3f);
        mamiferos[5] = new Perro("Selva", 1, 1, 200, "Perris", "negro", 4);

        for (Mamifero mamifero : mamiferos) {
            System.out.println("//////////// MAMÍFERO ////////////");
            System.out.println("Habitat: " + mamifero.getHabitat());
            System.out.println("Altura: " + mamifero.getHabitat() + " metros");
            System.out.println("Largo: " + mamifero.getLargo() + " metros");
            System.out.println("Peso: " + mamifero.getPeso() + " kg");
            System.out.println("Nombre Científico: " + mamifero.getNombreCientifico());
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println();
        }
    }
}
