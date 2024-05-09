package sesion1;


public class Vehiculo { // extends Object

    private String matricula;
    private String color;


    public Vehiculo(String matricula, String color){
        this.matricula=matricula;
        this.color=color;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

}

