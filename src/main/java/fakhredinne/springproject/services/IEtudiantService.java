package fakhredinne.springproject.services;

import fakhredinne.springproject.Model.Contrat;
import fakhredinne.springproject.Model.Equipe;
import fakhredinne.springproject.Model.Etudiant;
import fakhredinne.springproject.Repository.ContratRepository;
import fakhredinne.springproject.Repository.DepartementRepository;
import fakhredinne.springproject.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface IEtudiantService {
    public List<Etudiant> findAll();

    public Etudiant findByIdEtudiant(Long id);

    public Etudiant addEtudiant(Etudiant c);
    public void DeleteEtudiant(Long id);

    public Etudiant updateEtudiant(Long id , Etudiant e);

    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);
    public Contrat affectContratToEtudiant (Integer idContrat,String nomE,String prenomE);

    public Set<Etudiant> getEtudiantsByDepartement(Integer idDepartement);


}
