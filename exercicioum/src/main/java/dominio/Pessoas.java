package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoas implements Serializable{
	
	/*Descrição da atividade
	 * Faça as configurações da classe Pessoa e os mapeamentos*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//@Colum indica para o JPA que o nome do atributo vai ser diferente do nome da classe.
	@Column(name="nomeCompleto")
	private String nome;
	private String email;
	private static final long serialVersionUID = 1L;

	public Pessoas() {
		
	}
	
	public Pessoas(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoas [id: "
				+ id 
				+ ", nome: " 
				+ nome 
				+ ", email: " 
				+ email 
				+ "]";
	}
	
	
}
