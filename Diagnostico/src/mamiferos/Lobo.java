package mamiferos;
public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;
    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada= numCamada;
        this.especieLobo= especieLobo;
    }

    @Override
    public String comer() {
        return "Lobo comiendo";
    }

    @Override
    public String dormir() {
        return "Lobo durmiendo";
    }

    @Override
    public String correr() {
        return "Lobo corriendo";
    }

    @Override
    public String comunicarse() {
        return "Lobo comunicándose";
    }
}
