package fakhredinne.springproject.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;
import java.util.Set;

@Entity//create table in db
@Table( name = "Equipe") //Change name in DB
@Getter
@Setter
@ToString
public class Equipe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Long idEquipe ;
    private String nomEquipe ;
    @Enumerated(EnumType.STRING)
    private Niveau niveau ;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "equipes")
    private Set<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;
    @ManyToOne
    private Entreprise entreprise;
}
