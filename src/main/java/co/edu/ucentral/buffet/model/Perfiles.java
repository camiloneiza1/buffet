package co.edu.ucentral.buffet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Perfiles")
public class Perfiles {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPerfiles;
    private String perfil;
    @ManyToMany
    @JoinTable(name="usuarioPerfil",joinColumns=@JoinColumn(name="idUsuario"), inverseJoinColumns=@JoinColumn(name="idPerfil"))

    public Integer getIdPerfiles() {
        return this.idPerfiles;
    }

    public void setIdPerfiles(Integer idPerfiles) {
        this.idPerfiles = idPerfiles;
    }

    public String getPerfil() {
        return this.perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "{" +
            " idPerfiles='" + getIdPerfiles() + "'" +
            ", perfil='" + getPerfil() + "'" +
            "}";
    } 
}
