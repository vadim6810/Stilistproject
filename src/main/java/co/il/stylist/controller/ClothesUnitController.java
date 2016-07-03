package co.il.stylist.controller;

import co.il.stylist.model.ClothesUnit;
import co.il.stylist.service.ClothesUnitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by S on 01.07.2016.
 */

@RestController
@RequestMapping("/rest/clothesunit/")
@ResponseBody
public class ClothesUnitController {

    @Autowired
    ClothesUnitServices clothesUnitServices;

    @RequestMapping("/list")
    public List<ClothesUnit> radioTest() {
        List<ClothesUnit> clientList=clothesUnitServices.list();
        return clientList;
    }


}
