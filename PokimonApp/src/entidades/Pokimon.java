
package entidades;

public class Pokimon {
    private String nombre;
    private int vida;
    private int nivel;

    public Pokimon(String nombre) {
        this.nombre = nombre;
        this.vida = 40 + nivel*5;
        this.nivel =5;
    }
    
    public String MostrarEstado(){
        
        String estado= this.nombre + " / " + this.vida+
                " HP ";
        return estado;
    }
    
    
    String Atacar(Pokimon contricante){
        String resultado= "";
        int ataque = (int) (Math.random()*6 + 5);        
        int critico = (int) (Math.random() * 100);
        return resultado;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    
}
