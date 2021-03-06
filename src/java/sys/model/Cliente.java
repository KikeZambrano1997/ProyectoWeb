package sys.model;
// Generated 07-ago-2017 10:34:14 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int id;
     private String tipo;
     private String identificacion;
     private String apellidos;
     private String nombres;
     private Date fechanac;
     private String estadocivil;
     private String sexo;
     private String ciudad;
     private String email;
     private String telf;
     private String celular;
     private String direccion;

    public Cliente() {
    }

	
    public Cliente(int id, String tipo, String identificacion, String apellidos, String nombres, String ciudad) {
        this.id = id;
        this.tipo = tipo;
        this.identificacion = identificacion;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.ciudad = ciudad;
    }
    public Cliente(int id, String tipo, String identificacion, String apellidos, String nombres, Date fechanac, String estadocivil, String sexo, String ciudad, String email, String telf, String celular, String direccion) {
       this.id = id;
       this.tipo = tipo;
       this.identificacion = identificacion;
       this.apellidos = apellidos;
       this.nombres = nombres;
       this.fechanac = fechanac;
       this.estadocivil = estadocivil;
       this.sexo = sexo;
       this.ciudad = ciudad;
       this.email = email;
       this.telf = telf;
       this.celular = celular;
       this.direccion = direccion;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public Date getFechanac() {
        return this.fechanac;
    }
    
    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }
    public String getEstadocivil() {
        return this.estadocivil;
    }
    
    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelf() {
        return this.telf;
    }
    
    public void setTelf(String telf) {
        this.telf = telf;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}


