package mamiferos;

public class Guepardo extends Felino {
    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "Guepardo comiendo";
    }

    @Override
    public String dormir() {
        return "Guepardo durmiendo";
    }

    @Override
    public String correr() {
        return "Guepardo corriendo";
    }

    @Override
    public String comunicarse() {
        return "Guepardo comunicándose";
    }
}
