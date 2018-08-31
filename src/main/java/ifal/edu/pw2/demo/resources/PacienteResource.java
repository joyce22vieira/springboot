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

import ifal.edu.pw2.demo.modelo.Paciente;
import ifal.edu.pw2.demo.repositorios.PacienteRepository;

@RestController
@RequestMapping("/api/paciente")
public class PacienteResource {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@GetMapping
	public List<Paciente> get(){
		return pacienteRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Paciente get(@PathVariable("id") Integer id) {
		return pacienteRepository.getOne(id);
	}
	
	@PostMapping
	public Paciente save(@RequestBody Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	@PutMapping
	public Paciente update(@RequestBody Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		pacienteRepository.deleteById(id);
	}
}
