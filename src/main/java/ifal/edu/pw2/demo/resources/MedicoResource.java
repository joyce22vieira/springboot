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

import ifal.edu.pw2.demo.modelo.Medico;
import ifal.edu.pw2.demo.repositorios.MedicoRepository;

@RestController
@RequestMapping("/api/medico")
public class MedicoResource {

	@Autowired
	MedicoRepository medicoRepository;
	
	@GetMapping
	public List<Medico> get(){
		return medicoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Medico get(@PathVariable("id") Integer id) {
		return medicoRepository.getOne(id);
	}
	
	@PostMapping
	public Medico save(@RequestBody Medico medico) {
		return medicoRepository.save(medico);
	}
	
	@PutMapping
	public Medico update(@RequestBody Medico medico) {
		return medicoRepository.save(medico);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		medicoRepository.deleteById(id);
	}
}
