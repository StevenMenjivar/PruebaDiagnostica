package mamiferos;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "Tigre comiendo";
    }

    @Override
    public String dormir() {
        return "Tigre durmiendo";
    }

    @Override
    public String correr() {
        return "Tigre corriendo";
    }

    @Override
    public String comunicarse() {
        return "Tigre comunicándose";
    }
}
