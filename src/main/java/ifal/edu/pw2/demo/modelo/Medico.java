package ifal.edu.pw2.demo.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medico {

	@Id
	@GeneratedValue
	private Integer id_medico;
	
	@Column
	private String nome;
	
	@Column
	private String especialidade;
	
	@Column
	private String crm;
	
	@OneToMany(mappedBy="medico")
	private List<Atendimento> atendimento;
	
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Integer getId() {
		return id_medico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_medico == null) ? 0 : id_medico.hashCode());
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
		Medico other = (Medico) obj;
		if (id_medico == null) {
			if (other.id_medico != null)
				return false;
		} else if (!id_medico.equals(other.id_medico))
			return false;
		return true;
	}
	
	
	
}
