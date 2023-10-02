package mamiferos;

public class Leon extends Felino {
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "León dormido";
    }

    @Override
    public String dormir() {
        return "León dormido";
    }

    @Override
    public String correr() {
        return "León corriendo";
    }

    @Override
    public String comunicarse() {
        return "León rugiendo";
    }
}

