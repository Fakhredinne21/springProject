package fakhredinne.springproject.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Universite")
@Getter
@Setter
@ToString
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Long idUniv;
    private String nomUniv;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> Departements;
}
