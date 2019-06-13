
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
        
        String estado= " / " + this.vida+
                " HP ";
        return estado;
    }
    public String Atacar(Pokimon contricante){
        String resultado= "";
        int ataque = (int) (Math.random()*5 + 5);        
        int critico = (int)(Math.random()*100);
        int esquivar =(int)(Math.random()*100);
        
        if(critico<=20){
            resultado= contricante.nombre + " recibió un ataque crítico de " + ataque;
        }
        else if(critico<=15){
            resultado= contricante.nombre + " esquivó un ataque ";
        }
        else{
            resultado= contricante.nombre + "recibió un ataque de " + ataque;
            
        }
        return resultado;
    }
    public String UsarHP(Pokimon este){
        String hp ="";
        int HP =this.vida + 15;
        este.vida= HP;
        hp = este.nombre + " ha usado la poción, su vida aumenta a: " + HP;
        return hp;
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
