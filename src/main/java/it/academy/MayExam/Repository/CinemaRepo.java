package it.academy.MayExam.Repository;

import it.academy.MayExam.Entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepo extends JpaRepository<Cinema, Long> {
}
