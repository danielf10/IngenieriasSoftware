package titulo;
// Generated Apr 10, 2016 11:22:09 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Admin generated by hbm2java
 */
public class Admin  implements java.io.Serializable {


     private BigDecimal id;
     private String nombre;
     private String apellidop;
     private String apellidom;
     private String email;
     private String password;
     private String direccion;
     private String fechaContra;
     private Set<Estudiante> estudiantes = new HashSet<Estudiante>(0);

    public Admin() {
    }

	
    public Admin(BigDecimal id) {
        this.id = id;
    }
    public Admin(BigDecimal id, String nombre, String apellidop, String apellidom, String email, String password, String direccion, String fechaContra, Set<Estudiante> estudiantes) {
       this.id = id;
       this.nombre = nombre;
       this.apellidop = apellidop;
       this.apellidom = apellidom;
       this.email = email;
       this.password = password;
       this.direccion = direccion;
       this.fechaContra = fechaContra;
       this.estudiantes = estudiantes;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidop() {
        return this.apellidop;
    }
    
    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }
    public String getApellidom() {
        return this.apellidom;
    }
    
    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
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
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getFechaContra() {
        return this.fechaContra;
    }
    
    public void setFechaContra(String fechaContra) {
        this.fechaContra = fechaContra;
    }
    public Set<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }
    
    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }




}


