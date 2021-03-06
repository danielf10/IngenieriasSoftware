package pTitulo2;
// Generated May 4, 2016 2:55:33 PM by Hibernate Tools 4.3.1


import dao.EstudianteDao;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Estudiante generated by hbm2java
 */
@Entity
@Table(name="estudiante"
    ,schema="public"
)
@ManagedBean
public class Estudiante  implements java.io.Serializable {


     private int noCuenta;
     private Admin admin;
     private Profesor profesor;
     private Usuarios usuarios;
     private String nombre;
     private String apellidop;
     private String apellidom;
     private String email;
     private String password;
     private Integer porcentajeCredi;
     private String carrera;
     private String fechaRegistro;
     private Date fechaAsigProyecto;
     private Integer idProyecto;
     private Set solicitarProyectos = new HashSet(0);

    public Estudiante() {
    }

	
    public Estudiante(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public Estudiante(Admin admin, Profesor profesor, Usuarios usuarios, String nombre, String apellidop, String apellidom, String email, String password, Integer porcentajeCredi, String carrera, String fechaRegistro, Date fechaAsigProyecto, Integer idProyecto, Set solicitarProyectos) {
       this.admin = admin;
       this.profesor = profesor;
       this.usuarios = usuarios;
       this.nombre = nombre;
       this.apellidop = apellidop;
       this.apellidom = apellidom;
       this.email = email;
       this.password = password;
       this.porcentajeCredi = porcentajeCredi;
       this.carrera = carrera;
       this.fechaRegistro = fechaRegistro;
       this.fechaAsigProyecto = fechaAsigProyecto;
       this.idProyecto = idProyecto;
       this.solicitarProyectos = solicitarProyectos;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="usuarios"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="no_cuenta", unique=true, nullable=false)
    public int getNoCuenta() {
        return this.noCuenta;
    }
    
    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_admin")
    public Admin getAdmin() {
        return this.admin;
    }
    
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_profesor")
    public Profesor getProfesor() {
        return this.profesor;
    }
    
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
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

    
    @Column(name="porcentaje_credi")
    public Integer getPorcentajeCredi() {
        return this.porcentajeCredi;
    }
    
    public void setPorcentajeCredi(Integer porcentajeCredi) {
        this.porcentajeCredi = porcentajeCredi;
    }

    
    @Column(name="carrera")
    public String getCarrera() {
        return this.carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    @Column(name="fecha_registro")
    public String getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_asig_proyecto", length=13)
    public Date getFechaAsigProyecto() {
        return this.fechaAsigProyecto;
    }
    
    public void setFechaAsigProyecto(Date fechaAsigProyecto) {
        this.fechaAsigProyecto = fechaAsigProyecto;
    }

    
    @Column(name="id_proyecto")
    public Integer getIdProyecto() {
        return this.idProyecto;
    }
    
    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estudiante")
    public Set getSolicitarProyectos() {
        return this.solicitarProyectos;
    }
    
    public void setSolicitarProyectos(Set solicitarProyectos) {
        this.solicitarProyectos = solicitarProyectos;
    }

     public void guardarEstudiante() {
        System.out.println("Llegue1");
        EstudianteDao p = new EstudianteDao();
        p.agregarEstudiante(this);
    }

}


