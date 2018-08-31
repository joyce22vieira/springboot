package ifal.edu.pw2.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifal.edu.pw2.demo.modelo.Atendimento;
import ifal.edu.pw2.demo.repositorios.AtendimentoRepository;

@RestController
@RequestMapping("/api/atendimento")
public class AtendimentoResource {
	
	@Autowired
	AtendimentoRepository atendimentoRepository;
	
	@GetMapping
	public List<Atendimento> get(){
		return atendimentoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Atendimento get(@PathVariable("id") Integer id) {
		return atendimentoRepository.getOne(id);
	}
	
	@PostMapping
	public Atendimento save(@RequestBody Atendimento atendimento) {
		return atendimentoRepository.save(atendimento);
	}
	
	@PutMapping
	public Atendimento update(@RequestBody Atendimento atendimento) {
		return atendimentoRepository.save(atendimento);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		atendimentoRepository.deleteById(id);
	}

}
