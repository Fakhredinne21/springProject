package fakhredinne.springproject.services;

import fakhredinne.springproject.Model.Universite;

import java.util.List;

public interface IUniversityService {
    public List<Universite> findAll();

    public Universite findByIdUniversite(Long id);

    public Universite addUniversite(Universite c);
    public void DeleteUniversite(Long id);

    public Universite updateUniversite(Long id , Universite e);
}
