
package entidades;

/**
 *
 * @author alumno
 */
public class Entrenador {
    private String nombre;
    private boolean sexo;

    public Entrenador(String n, boolean sexo) {
        this.nombre = n;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
    
    
    
    
}
