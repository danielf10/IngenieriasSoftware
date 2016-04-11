package titulo;
// Generated Apr 10, 2016 11:22:09 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Profesor generated by hbm2java
 */
public class Profesor  implements java.io.Serializable {


     private BigDecimal noCuenta;
     private String nombre;
     private String apellidom;
     private String apellidop;
     private String email;
     private String password;
     private String GEstudios;
     private String areaInv;
     private Set<Proyecto> proyectos = new HashSet<Proyecto>(0);
     private Set<Estudiante> estudiantes = new HashSet<Estudiante>(0);

    public Profesor() {
    }

	
    public Profesor(BigDecimal noCuenta) {
        this.noCuenta = noCuenta;
    }
    public Profesor(BigDecimal noCuenta, String nombre, String apellidom, String apellidop, String email, String password, String GEstudios, String areaInv, Set<Proyecto> proyectos, Set<Estudiante> estudiantes) {
       this.noCuenta = noCuenta;
       this.nombre = nombre;
       this.apellidom = apellidom;
       this.apellidop = apellidop;
       this.email = email;
       this.password = password;
       this.GEstudios = GEstudios;
       this.areaInv = areaInv;
       this.proyectos = proyectos;
       this.estudiantes = estudiantes;
    }
   
    public BigDecimal getNoCuenta() {
        return this.noCuenta;
    }
    
    public void setNoCuenta(BigDecimal noCuenta) {
        this.noCuenta = noCuenta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidom() {
        return this.apellidom;
    }
    
    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }
    public String getApellidop() {
        return this.apellidop;
    }
    
    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGEstudios() {
        return this.GEstudios;
    }
    
    public void setGEstudios(String GEstudios) {
        this.GEstudios = GEstudios;
    }
    public String getAreaInv() {
        return this.areaInv;
    }
    
    public void setAreaInv(String areaInv) {
        this.areaInv = areaInv;
    }
    public Set<Proyecto> getProyectos() {
        return this.proyectos;
    }
    
    public void setProyectos(Set<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    public Set<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }
    
    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }




}


