package edu.ulatina.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the correo database table.
 * 
 */
@Entity
@NamedQueries(value = {
		@NamedQuery(name="Correo.findAll", query="SELECT c FROM Correo c"),
		@NamedQuery(
				name = "Correo.findAllCorreo", 
				query = "SELECT d FROM Correo d WHERE d.correo LIKE :tituloParam ORDER BY d.correo"),
		@NamedQuery(name="Correo.findByPrimaryKey",
        query="SELECT e FROM Correo e WHERE e.idCorreo = :id"),
})

@NamedNativeQueries({
	@NamedNativeQuery(
			name="Correo.findAllSQL", 
			query="SELECT id, correo FROM Correo", 
			resultClass=Correo.class), 
	@NamedNativeQuery(
			name="Correo.findAllSQLWithParam", 
			query="SELECT * FROM Correo WHERE nombre LIKE :correoParam ORDER BY correo", 
			resultClass=Correo.class)			
})
public class Correo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCorreo;

	private String correo;

	//bi-directional many-to-many association to Listacorreo
	@ManyToMany
	@JoinTable(
		name="correoporlistacorreos"
		, joinColumns={
			@JoinColumn(name="Correo")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ListaCorreos")
			}
		)
	private List<Listacorreo> listacorreos;

	public Correo() {
	}

	public int getIdCorreo() {
		return this.idCorreo;
	}

	public void setIdCorreo(int idCorreo) {
		this.idCorreo = idCorreo;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Listacorreo> getListacorreos() {
		return this.listacorreos;
	}

	public void setListacorreos(List<Listacorreo> listacorreos) {
		this.listacorreos = listacorreos;
	}

}