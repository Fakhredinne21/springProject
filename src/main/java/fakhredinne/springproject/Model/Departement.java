package fakhredinne.springproject.Model;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart;
    private String nomDepart;

}
