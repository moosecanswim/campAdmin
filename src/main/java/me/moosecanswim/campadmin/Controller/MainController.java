package me.moosecanswim.campadmin.Controller;

import me.moosecanswim.campadmin.Model.Troop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class MainController {

    @RequestMapping("/")
    public String adminHome(Model model){


        return "AdminHome";
    }
    @RequestMapping(value="/formTroopECheckin", method=GET)
    public String troopEcheckinForm(Model model){

        model.addAttribute("Troop", new Troop());
        return "formTroopECheckin";
    }

}
