package es.uah.usuariosMatriculas.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "authorities", schema = "usuariosdbsec")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;

    private String authority;

    public Rol() {
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
