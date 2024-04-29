package fakhredinne.springproject.services;

import fakhredinne.springproject.Model.Contrat;

public interface IContratService {
    public Contrat findByIdContrat(Long id);

    public Contrat addContrat(Contrat c);
    public void DeleteContrat(Long id);

    public Contrat updateContrat(Long id , Contrat e);
   // public void retrieveAndUpdateStatusContrat();
}
