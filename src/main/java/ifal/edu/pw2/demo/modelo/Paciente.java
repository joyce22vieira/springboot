package ifal.edu.pw2.demo.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente{
	
	@Id
	@GeneratedValue
	private Integer id_paciente;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;

	@OneToMany(mappedBy="paciente")
	private List<Atendimento> atendimento;
	
	@OneToOne
	private Plano plano; 

	public Paciente() {
		
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Paciente(Integer id, String nome) {
		this.nome = nome;
		this.id_paciente = id;
	}

	public Integer getId() {
		return id_paciente;
	}

	public void setId(Integer id) {
		this.id_paciente = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_paciente == null) ? 0 : id_paciente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (id_paciente == null) {
			if (other.id_paciente != null)
				return false;
		} else if (!id_paciente.equals(other.id_paciente))
			return false;
		return true;
	}

	
	
}
