package fakhredinne.springproject.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Etudiant")
@Getter
@Setter
@ToString
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipes;
    @ManyToOne
    private Departement departement;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> contrats;

    public Etudiant(Set<Contrat> contrats) {
        this.contrats = contrats;
    }
}
