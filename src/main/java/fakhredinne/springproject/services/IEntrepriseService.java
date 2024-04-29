package fakhredinne.springproject.services;

import fakhredinne.springproject.Model.Entreprise;

import java.util.List;

public interface IEntrepriseService {
    public List<Entreprise> findAll();

    public Entreprise findByIdEntreprise(Long id);

    public Entreprise addEntreprise(Entreprise c);
    public void DeleteEntreprise(Long id);

    public Entreprise updateEntreprise(Long id , Entreprise e);
}
