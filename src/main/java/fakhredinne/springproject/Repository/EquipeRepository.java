package fakhredinne.springproject.Repository;

import fakhredinne.springproject.Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long> {


    public List<Equipe> findAllBy();
    public Equipe findByIdEquipe(Long id);

}
