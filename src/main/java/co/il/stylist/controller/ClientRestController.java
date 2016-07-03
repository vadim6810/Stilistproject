package co.il.stylist.controller;

import co.il.stylist.model.Client;
import co.il.stylist.model.ClothesUnit;
import co.il.stylist.service.ClientServices;
import co.il.stylist.service.ClothesUnitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by S on 01.07.2016.
 */

@RestController
@RequestMapping("/rest/client/")
@ResponseBody
public class ClientRestController {

    @Autowired
    ClientServices clientServices;

    @RequestMapping("/list")
    public List<Client> radioTest() {
        List<Client> clientList=clientServices.list();
        return clientList;
    }
}
