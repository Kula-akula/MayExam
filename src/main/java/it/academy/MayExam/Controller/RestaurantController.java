package it.academy.MayExam.Controller;

import it.academy.MayExam.Entity.Restaurant;
import it.academy.MayExam.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @PostMapping
    public Restaurant save(@RequestBody Restaurant restaurant){
        return  restaurantService.save(restaurant);

    }

    @GetMapping
    public List<Restaurant> getAll(){return restaurantService.getAll();}

    @GetMapping("/{id}")
    public Restaurant getById(@PathVariable("id") Long id){return restaurantService.getById(id);}

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        restaurantService.deleteById(id);
    }

}
