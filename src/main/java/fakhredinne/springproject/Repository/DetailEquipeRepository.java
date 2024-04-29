package fakhredinne.springproject.Repository;

import fakhredinne.springproject.Model.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Long> {

    public DetailEquipe findByidDetailEquipe(Long id);




}
