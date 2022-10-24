package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.management.modelmbean.ModelMBean;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

        private CarService carService = new CarService();


        @GetMapping
        public String getCar(@RequestParam(value = "count",required = false)
                                  Integer count,ModelMap modelMap){

            List<Car> cars = (List<Car>) carService.getCarCount(count);

            modelMap.addAttribute("cars", cars);


            return "cars";
        }






}
