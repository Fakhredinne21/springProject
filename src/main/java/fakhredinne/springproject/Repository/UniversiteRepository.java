package fakhredinne.springproject.Repository;

import fakhredinne.springproject.Model.Contrat;
import fakhredinne.springproject.Model.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    public Universite findByIdUniv(Long id);
}
