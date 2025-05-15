package obj2.unahur.Personas;

public class Persona {
    private Integer edad;
    
    public Persona(Integer edad){
        this.edad = edad;
    }
    
    public Integer getEdad() {
        return edad;
    }
    
    public Integer inteligencia(){
        if(edad >= 20 && edad <= 40){
            return 12;
        }else{
            return 8;
        }
    }

    public Integer potencia(){
        return 20;
    }


    public Boolean esDestacada(){
        return edad == 25 || edad == 35;
    }
}
