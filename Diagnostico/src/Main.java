// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import mamiferos.*;

public class Main {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        //Objetos de mamíferos
        mamiferos[0] = new Tigre("Selva", 1f, 1f, 310, "Panthera tigris", 2.5f, 55, "Sumatra");
        mamiferos[1] = new Leon("Sabana", 1.2f, 0.9f, 190, "Panthera leo", 5.5f, 42, 2,700);
        mamiferos[2] = new Guepardo("Bosque seco",0.94f , 1, 72, "Acinonyx jubatus", 4.5f, 60);
        mamiferos[3] = new Lobo("Selva", 0.85f, 0.75f, 80, "Canis lupus", "blanco", 4.3f);
        mamiferos[4] = new Perro("Multihábitat", 0.5f, 0.5f, 55, "Canis lupus familiaris", "negro", 4);

        for (Mamifero mamifero : mamiferos) {
            System.out.println("//////////// MAMÍFERO ////////////");
            System.out.println("Habitat: " + mamifero.getHabitat());
            System.out.println("Altura: " + mamifero.getAltura() + " metros");
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
