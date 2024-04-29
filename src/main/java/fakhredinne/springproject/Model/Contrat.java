package fakhredinne.springproject.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table( name = "Contrat")
@Getter
@Setter
@ToString
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Long idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialte;
    Boolean archive;
    private long montantContrat;
    @ManyToOne
    private Etudiant etudiant;



}
