package es.uah.usuariosMatriculas.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "usuariosdbsec")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(name="username")
    private String nombre;

    @Column(name="password")
    private String clave;

    private String correo;

    private boolean enable;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Matricula> matriculas;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "users_has_authorities", joinColumns = {
            @JoinColumn(name = "Users_idUsuario", referencedColumnName = "idUsuario")}, inverseJoinColumns = {
            @JoinColumn(name = "Authorities_idRol", referencedColumnName = "idRol")})
    private List<Rol> roles;

    public Usuario() {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return enable == usuario.enable && Objects.equals(idUsuario, usuario.idUsuario) && Objects.equals(nombre, usuario.nombre)
                && Objects.equals(clave, usuario.clave) && Objects.equals(correo, usuario.correo) && Objects.equals(matriculas, usuario.matriculas)
                && Objects.equals(roles, usuario.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nombre, clave, correo, enable, matriculas, roles);
    }

    public void addMatricula(Matricula matricula) {
        getMatriculas().add(matricula);
        matricula.setUsuario(this);
    }

    public void removeMatricula(Matricula matricula) {
        if (matricula != null) {
            getMatriculas().remove(matricula);
        }
    }

}
