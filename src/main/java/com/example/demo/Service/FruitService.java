
package com.example.demo.Service;

        import com.example.demo.Repo.FruitRepo;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.web.servlet.ModelAndView;

@Service
public class FruitService {
    @Autowired
    FruitRepo fruitRepo;
    public ModelAndView getFruits() {
        ModelAndView mav = new ModelAndView("fruits");
        mav.addObject("fruits",fruitRepo.findAll());
        return mav;
    }
}