package Taller_Enumeracion;

public enum Talla {
    SMALL("pequeña"),
    MEDIUM("mediana"),
    LARGE("grande");

    private final String TRADUCTALLA;

    Talla(String traducTalla){
        this.TRADUCTALLA = traducTalla;
    }
    
    String getTraducTalla () {
        return this.TRADUCTALLA;
    }

}
