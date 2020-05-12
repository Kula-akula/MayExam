package it.academy.MayExam.Service.Implimitation;

import it.academy.MayExam.Entity.Restaurant;
import it.academy.MayExam.Repository.RestaurantRepo;
import it.academy.MayExam.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepo restaurantRepo;

    @Override
    public Restaurant getById(Long id) {
        Optional<Restaurant> restaurantOptional=restaurantRepo.findById(id);
        return restaurantOptional.get();
    }

    @Override
    public List<Restaurant> getAll() {
        return restaurantRepo.findAll();
    }

    @Override
    public Restaurant save(Restaurant object) {
        return restaurantRepo.save(object);
    }

    @Override
    public void deleteById(Long id) {
        restaurantRepo.deleteById(id);
    }
}
