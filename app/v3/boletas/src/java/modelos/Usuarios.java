package modelos;
// Generated 17/03/2019 04:22:32 PM by Hibernate Tools 4.3.1



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idUsuarios;
     private String nombUsu;
     private int cedulUsu;
     private int idPerfiles;

    public Usuarios() {
    }

    public Usuarios(String nombUsu, int cedulUsu, int idPerfiles) {
       this.nombUsu = nombUsu;
       this.cedulUsu = cedulUsu;
       this.idPerfiles = idPerfiles;
    }
   
    public Integer getIdUsuarios() {
        return this.idUsuarios;
    }
    
    public void setIdUsuarios(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
    }
    public String getNombUsu() {
        return this.nombUsu;
    }
    
    public void setNombUsu(String nombUsu) {
        this.nombUsu = nombUsu;
    }
    public int getCedulUsu() {
        return this.cedulUsu;
    }
    
    public void setCedulUsu(int cedulUsu) {
        this.cedulUsu = cedulUsu;
    }
    public int getIdPerfiles() {
        return this.idPerfiles;
    }
    
    public void setIdPerfiles(int idPerfiles) {
        this.idPerfiles = idPerfiles;
    }




}

