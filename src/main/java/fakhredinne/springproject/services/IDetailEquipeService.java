package fakhredinne.springproject.services;


import fakhredinne.springproject.Model.DetailEquipe;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IDetailEquipeService {
    public List<DetailEquipe> findAll();

    public DetailEquipe findByIdDetailEquipe(Long id);

    public DetailEquipe addDetailEquipe(DetailEquipe c);
    public void DeletedetailEquipe(Long id);

    public DetailEquipe updateDetailEquipe(Long id , DetailEquipe e);
}
