package tn.esprit.spring.stationdeski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.stationdeski.entities.Moniteur;
import tn.esprit.spring.stationdeski.entities.Piste;


public interface PisteRepository extends JpaRepository<Piste,Integer> {
}
