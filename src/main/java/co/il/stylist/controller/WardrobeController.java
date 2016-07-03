package co.il.stylist.controller;

import co.il.stylist.model.ClothesUnit;
import co.il.stylist.model.Wardrobe;
import co.il.stylist.service.ClothesUnitServices;
import co.il.stylist.service.WardrobeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by S on 01.07.2016.
 */

@RestController
@RequestMapping("/rest/wardrobe/")
@ResponseBody
public class WardrobeController {

    @Autowired
    WardrobeServices wardrobeServices;

    @RequestMapping("/list")
    public List<Wardrobe> radioTest() {
        List<Wardrobe> wardrobeList=wardrobeServices.list();
        return wardrobeList;
    }


}
