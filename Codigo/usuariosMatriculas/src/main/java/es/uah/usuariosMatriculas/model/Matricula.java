package es.uah.usuariosMatriculas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "matriculas", schema = "usuariosdbsec")
public class Matricula implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idMatricula;

    private Integer idCurso;

    private Double precio;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "Users_idUsuario", referencedColumnName = "idUsuario", nullable = false)
    @JsonIgnoreProperties("matriculas")
    private Usuario usuario;

    public Matricula() {
    }

    public Integer getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuariosByUsuariosIdUsuario) {
        this.usuario = usuariosByUsuariosIdUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matricula)) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(idMatricula, matricula.idMatricula) && Objects.equals(idCurso, matricula.idCurso) && Objects.equals(precio, matricula.precio) && Objects.equals(fecha, matricula.fecha) && Objects.equals(usuario, matricula.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatricula, idCurso, precio, fecha, usuario);
    }

}
