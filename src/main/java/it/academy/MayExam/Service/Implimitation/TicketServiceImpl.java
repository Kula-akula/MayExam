package it.academy.MayExam.Service.Implimitation;

import it.academy.MayExam.Entity.Ticket;
import it.academy.MayExam.Repository.TicketRepo;
import it.academy.MayExam.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepo ticketRepo;

    @Override
    public Ticket getById(Long id) {
        Optional<Ticket> optionalTicket=ticketRepo.findById(id);
        return optionalTicket.get();
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepo.findAll();
    }

    @Override
    public Ticket save(Ticket object) {
        return ticketRepo.save(object);
    }

    @Override
    public void deleteById(Long id) {
        ticketRepo.deleteById(id);
    }
}
