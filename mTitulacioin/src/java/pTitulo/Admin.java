package pTitulo;
// Generated May 4, 2016 2:55:33 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name="admin"
    ,schema="public"
)
public class Admin  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String apellidop;
     private String apellidom;
     private String email;
     private String password;
     private String direccion;
     private String fechaContra;
     private Set estudiantes = new HashSet(0);

    public Admin() {
    }

	
    public Admin(int id) {
        this.id = id;
    }
    public Admin(int id, String nombre, String apellidop, String apellidom, String email, String password, String direccion, String fechaContra, Set estudiantes) {
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
   
     @Id 

    
    @Column(name="id", nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="nombre")
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="apellidop")
    public String getApellidop() {
        return this.apellidop;
    }
    
    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    
    @Column(name="apellidom")
    public String getApellidom() {
        return this.apellidom;
    }
    
    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    
    @Column(name="email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="password")
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="direccion")
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="fecha_contra")
    public String getFechaContra() {
        return this.fechaContra;
    }
    
    public void setFechaContra(String fechaContra) {
        this.fechaContra = fechaContra;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="admin")
    public Set getEstudiantes() {
        return this.estudiantes;
    }
    
    public void setEstudiantes(Set estudiantes) {
        this.estudiantes = estudiantes;
    }




}


