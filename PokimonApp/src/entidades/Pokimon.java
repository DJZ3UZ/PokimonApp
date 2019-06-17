
package entidades;

public class Pokimon {
    public String nombre;
    public int vida;
    public int nivel;
    public int pocima;

    public Pokimon(String nombre) {
        this.nombre = nombre;
        this.nivel=5;
        this.vida = 40 + this.nivel*5;
        
    }
    
    public String MostrarEstado(){
        String estado = this.vida + " HP";
        return estado;
        
        
    }
    public String Atacar(Pokimon contrincante){
        String resultado= "";
        int ataque = (int) (Math.random()*5 + 5);        
        int critico = (int)(Math.random()*100);
        int esquivar = (int)(Math.random()*100);
        
       if(critico<=20){
           ataque=(int)(ataque*2);
       }
       if(esquivar<=15){
           ataque=(int)(ataque*0);
       }
       contrincante.vida = contrincante.vida - ataque;
        
       if(contrincante.vida <= 0){
           contrincante.vida = 0;
        }
        
        if (critico <= 20) {
            resultado = contrincante.nombre 
                    + " recibió un ataque crítico de " + ataque;
        if(esquivar <= 15){
            resultado = contrincante.nombre
                    + " esquivo el ataque.";
        }
        }
        else {
            resultado = contrincante.nombre 
                    + " recibió un ataque de " + ataque;
        }
        
        return resultado;
    }
        
           
       
       
      
    
    public String usarPuntosdeVidaHP(Pokimon p){
        String hp="";
        int HP= p.vida + 15;
        p.vida=HP;
        if(p.vida >= 65){
            p.vida = 65;
            HP = HP-15;
        }
        if(p.vida>=65){
            hp= p.nombre + " ha usado poción, su vida es " + p.vida;
        }
        else{
            hp = p.nombre + " ha usado pocion, su vida aumenta " + HP;
        }
        return hp;
        
        
    }
    
    
    
    
}
