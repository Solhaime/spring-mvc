package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
public class CarController {
@GetMapping("/cars")
    public String carPage(@RequestParam(value = "count", required = false) Integer count, Model model){
        if(count == null) count = CarService.getCars().size();
        model.addAttribute("requestwithparam", CarService.countCars(count));
        return "/cars";
    }

}
