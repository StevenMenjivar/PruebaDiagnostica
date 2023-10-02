package mamiferos;
public class Perro extends Canino {
    private int fuerzaMordida;
    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida= fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Perro comiendo";
    }

    @Override
    public String dormir() {
        return "Perro durmiendo";
    }

    @Override
    public String correr() {
        return "Perro corriendo";
    }

    @Override
    public String comunicarse() {
        return "Perro comunicándose";
    }
}
