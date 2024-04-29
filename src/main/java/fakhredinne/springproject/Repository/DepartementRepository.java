package fakhredinne.springproject.Repository;

import fakhredinne.springproject.Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {
    public Departement findAllByIdDepart(Long id);


}
