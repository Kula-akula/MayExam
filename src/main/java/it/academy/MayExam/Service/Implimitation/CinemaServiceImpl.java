package it.academy.MayExam.Service.Implimitation;

import it.academy.MayExam.Entity.Cinema;
import it.academy.MayExam.Repository.CinemaRepo;
import it.academy.MayExam.Service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaRepo cinemaRepo;

    @Override
    public Cinema getById(Long id) {
        Optional<Cinema> optionalCinema=cinemaRepo.findById(id);
        return optionalCinema.get();
    }

    @Override
    public List<Cinema> getAll() {
        return cinemaRepo.findAll();
    }

    @Override
    public Cinema save(Cinema object) {
        return cinemaRepo.save(object);
    }

    @Override
    public void deleteById(Long id) {
        cinemaRepo.deleteById(id);
    }
}
