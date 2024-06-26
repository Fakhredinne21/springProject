package fakhredinne.springproject.Repository;

import fakhredinne.springproject.Model.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {
    Contrat findByIdContrat(Long id);
}
