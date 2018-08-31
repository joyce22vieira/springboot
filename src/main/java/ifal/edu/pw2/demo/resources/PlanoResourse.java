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
import ifal.edu.pw2.demo.modelo.Plano;
import ifal.edu.pw2.demo.repositorios.PlanoRepository;

@RestController
@RequestMapping("/api/plano")

public class PlanoResourse {
	
	@Autowired
	PlanoRepository planoRepository;
    @GetMapping
    public List<Plano> get(){
    	return planoRepository.findAll();
    }
    
    @GetMapping("{id}")
    public Plano get(@PathVariable("id") Integer id) {
    	return planoRepository.getOne(id);  	
    }
    
    @PostMapping
    public Plano save(@RequestBody Plano plano) {
    	return planoRepository.save(plano);
    }
    
    @PutMapping
    public Plano update(@RequestBody Plano plano) {
    	return planoRepository.save(plano);
    }
    
    @DeleteMapping("{id}")
     public void delete(@PathVariable("id") Integer id) {
         planoRepository.deleteById(id);	
    }
        
}
