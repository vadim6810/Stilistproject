package co.il.stylist.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletResponse;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
@ResponseBody
public class AppRestController {

	private static final String template = "Echo test response: %s!";
    private final RequestMappingHandlerMapping handlerMapping;


    @Autowired
    public AppRestController(RequestMappingHandlerMapping handlerMapping) {
        this.handlerMapping = handlerMapping;
    }

    public Map<RequestMappingInfo, HandlerMethod> getMappingsList() {
        Map<RequestMappingInfo, HandlerMethod> mappingMap=this.handlerMapping.getHandlerMethods();
        return mappingMap;
    }




}
