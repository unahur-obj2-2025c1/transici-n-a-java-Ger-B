package obj2.unahur.Personas;

public class Atleta extends Persona {
    private Integer masaMuscular;   //kilos
    private Integer tecnicasQueConoce;
    
    public Atleta(Integer edad){
        super(edad);
        this.masaMuscular = 4;
        this.tecnicasQueConoce = 2;
    }

    public Integer getMasaMuscular() {
        return masaMuscular;
    }

    public void setMasaMuscular(Integer masaMuscular) {
        this.masaMuscular = masaMuscular;
    }

    public Integer getTecnicasQueConoce() {
        return tecnicasQueConoce;
    }

    public void setTecnicasQueConoce(Integer tecnicasQueConoce) {
        this.tecnicasQueConoce = tecnicasQueConoce;
    }

    @Override
    public Integer potencia() {
        return super.potencia() * tecnicasQueConoce * masaMuscular;
    }

    @Override
    public Boolean esDestacada(){
        return super.esDestacada() || tecnicasQueConoce > 5;
    }

    public void entrenar(Integer dias){
        masaMuscular = masaMuscular + (dias/5);
    }

    public void aprenderTecnica(){
        tecnicasQueConoce += 1;
    }

}
