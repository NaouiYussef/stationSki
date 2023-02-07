package tn.esprit.spring.stationdeski.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Moniteur")
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMoniteur")
    private Integer idMoniteur; // Clé primaire
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecu;
    @OneToMany
    private Set<Cours> cours;
}
