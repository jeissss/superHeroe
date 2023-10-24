public class AquaHand extends SuperHero implements ActionHuman {

    //6 Atributos
    public String nombreHeroe = "Aquahand";

    public String colorDePiel = "Verde";

    public int potenciaDeChorro = 100;


    public int numeroDeBrazos = 2;


    public int velocidad = 85;

    public int resistencia = 91;

    public AquaHand(int health, int energy) {
        super(health, energy);
    }


    //3 Metodos
    public void LlamarApoyo() {
        System.out.println("Puede llamar animales marinos de apoyo");


    }

    public void nadarRapido() {
        System.out.println("Nada a toda velocidad por los mares mas espesos");
    }

    public void visionNocturna() {
        System.out.println("Puede ver con claridad los rincones mas oscuros del oceano");


    }


//1 Super poder

    public void superChorro() {
        energy = energy - 20;
        System.out.println("Atacaste a tu oponente, tu energia es : " + energy);

    }


    //1 Attack
    public void attack() {
        health = health - 20;
        System.out.println("Te atacaron, Tu salud es: " + health);
         ;

    }

    //SUPER PODER




//SETTER Y GETTER

    public String getNombreHeroe() {
        return nombreHeroe;
    }

    public void setNombreHeroe(String nombreHeroe) {
        this.nombreHeroe = nombreHeroe;
    }

    public String getColorDePiel() {
        return colorDePiel;
    }

    public void setColorDePiel(String colorDePiel) {
        this.colorDePiel = colorDePiel;
    }

    public int getPotenciaDeChorro() {
        return potenciaDeChorro;
    }

    public void setPotenciaDeChorro(int potenciaDeChorro) {
        this.potenciaDeChorro = potenciaDeChorro;
    }

    public int getNumeroDeBrazos() {
        return numeroDeBrazos;
    }

    public void setNumeroDeBrazos(int numeroDeBrazos) {
        this.numeroDeBrazos = numeroDeBrazos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void usarManos() {
        System.out.println("Tira chorros con gran potencia");
    }

    @Override
    public void usarPies() {

    }

    @Override
    public void moverse() {
        System.out.println("Se desplaza a gran velocidad por el agua");

    }

    @Override
    public void saltar() {

    }

    @Override
    public void hablar() {
        System.out.println("Llama animales marinos como apoyo");

    }
}



