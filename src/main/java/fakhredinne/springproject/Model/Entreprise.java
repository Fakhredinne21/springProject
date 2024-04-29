package fakhredinne.springproject.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Entreprise")
@Setter
@Getter
@ToString
public class Entreprise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEntreprise")
    private Long idEntreprise;
    private String nomEntreprise;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="entreprise")
    private Set<Equipe> equipes;
}
