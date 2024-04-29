package fakhredinne.springproject.Repository;

import fakhredinne.springproject.Model.Contrat;
import fakhredinne.springproject.Model.Etudiant;
import fakhredinne.springproject.Model.Niveau;
import fakhredinne.springproject.Model.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    public List<Etudiant> findByDepartementIdDepart(Long id);
    public List<Etudiant> findByEquipesIdEquipeAndEquipesNiveau(Long id, Niveau niveau);
    public Etudiant findByIdEtudiant(Long id);
    public Etudiant findByNomE(String nom);
    public Etudiant findByPrenomE(String prenom);

}
