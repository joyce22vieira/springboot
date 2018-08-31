package ifal.edu.pw2.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifal.edu.pw2.demo.modelo.Plano;
@Repository
public interface PlanoRepository extends  JpaRepository<Plano , Integer> {

}
