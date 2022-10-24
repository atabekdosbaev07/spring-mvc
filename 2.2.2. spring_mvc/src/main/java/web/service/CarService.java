package web.service;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> getCarCount(Integer count){

        List<Car> cars = new ArrayList<>();

        if(count==null){
            cars.add(new Car(1,"BMW","x7",2001));
            cars.add(new Car(2,"Tesla","S",2011));
            cars.add(new Car(3,"Nissan","PS",2005));
            cars.add(new Car(4,"Opel","agila",2002));
            cars.add(new Car(5,"Daewoo","matiz",2006));
        } else if(count == 1){
            cars.add(new Car(1,"BMW","x7",2001));
        }else if(count==2){
            cars.add(new Car(1,"BMW","x7",2001));
            cars.add(new Car(2,"Tesla","S",2011));
        } else if (count==3) {
            cars.add(new Car(1,"BMW","x7",2001));
            cars.add(new Car(2,"Tesla","S",2011));
            cars.add(new Car(3,"Nissan","PS",2005));
        } else if (count==4) {
            cars.add(new Car(1,"BMW","x7",2001));
            cars.add(new Car(2,"Tesla","S",2011));
            cars.add(new Car(3,"Nissan","PS",2005));
            cars.add(new Car(4,"Opel","agila",2002));
        } else if(count > 5){
            cars.add(new Car(1,"BMW","x7",2001));
            cars.add(new Car(2,"Tesla","S",2011));
            cars.add(new Car(3,"Nissan","PS",2005));
            cars.add(new Car(4,"Opel","agila",2002));
            cars.add(new Car(5,"Daewoo","matiz",2006));
        }else {
            System.out.println("error");
        }

        return cars;
    }


}
