package edu.ulatina.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the publicacion database table.
 * 
 */
@Entity
@NamedQueries(value = {
		@NamedQuery(name="Publicacion.findAll", query="SELECT p FROM Publicacion p"),
		@NamedQuery(
				name = "Publicacion.findAllTitulo", 
				query = "SELECT d FROM Publicacion d WHERE d.titulo LIKE :tituloParam ORDER BY d.titulo"),
		@NamedQuery(name="Publicacion.findByPrimaryKey",
        query="SELECT e FROM Publicacion e WHERE e.idPublicacion = :id"),
})

@NamedNativeQueries({
	@NamedNativeQuery(
			name="Publicacion.findAllSQL", 
			query="SELECT id, titulo, contenido FROM Publicacion", 
			resultClass=Publicacion.class), 
	@NamedNativeQuery(
			name="Publicacion.findAllSQLWithParam", 
			query="SELECT * FROM Publicacion WHERE nombre LIKE :tituloParam ORDER BY titulo", 
			resultClass=Publicacion.class)			
})

public class Publicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
        @Basic(optional = false)
        @Column(name = "idPublicacion")
        @SequenceGenerator( name = "mySeq", sequenceName = "MY_SEQ", allocationSize = 1, initialValue = 2 )
        @GeneratedValue(strategy=GenerationType.IDENTITY, generator="mySeq")
	private int idPublicacion;

	private String contenido;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String titulo;

	//bi-directional many-to-many association to Multimedia
	@ManyToMany(mappedBy="publicacions")
	private List<Multimedia> multimedias;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="Persona")
	private Persona personaBean;

	//bi-directional many-to-one association to Redsocial
	@ManyToOne
	@JoinColumn(name="RedSocial")
	private RedSocial redsocial;

	public Publicacion() {
	}

	public int getIdPublicacion() {
		return this.idPublicacion;
	}

	public void setIdPublicacion(int idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Multimedia> getMultimedias() {
		return this.multimedias;
	}

	public void setMultimedias(List<Multimedia> multimedias) {
		this.multimedias = multimedias;
	}

	public Persona getPersonaBean() {
		return this.personaBean;
	}

	public void setPersonaBean(Persona personaBean) {
		this.personaBean = personaBean;
	}

	public RedSocial getRedsocial() {
		return this.redsocial;
	}

	public void setRedsocial(RedSocial redsocial) {
		this.redsocial = redsocial;
	}

}