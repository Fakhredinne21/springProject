package fakhredinne.springproject.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.io.Serializable;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart;
    private String nomDepart;
    @OneToMany(cascade = CascadeType.ALL,mappedBy="departement")
    private Set<Etudiant> Etudiants;

}
