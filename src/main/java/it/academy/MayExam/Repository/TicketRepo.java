package it.academy.MayExam.Repository;

import it.academy.MayExam.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket,Long> {
}
