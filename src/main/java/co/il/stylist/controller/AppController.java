package co.il.stylist.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	AppRestController restController;


	// list of all rest mapping
	@RequestMapping(value = { "/", "/restmaps" }, method = RequestMethod.GET)
	public String listRestMaps(ModelMap model) {


        Map<RequestMappingInfo, HandlerMethod> mappingMap = restController.getMappingsList();
        List<String> restPaths = new ArrayList<String>();
        for (Map.Entry<RequestMappingInfo, HandlerMethod> item : mappingMap.entrySet()) {
            RequestMappingInfo mapping = item.getKey();
            HandlerMethod method = item.getValue();

            for (String urlPattern : mapping.getPatternsCondition().getPatterns()) {
                System.out.println(
                        method.getBeanType().getName() + "#" + method.getMethod().getName() +
                                " <-- " + urlPattern);
                restPaths.add(urlPattern);

                if (urlPattern.equals("some specific url")) {
                    //add to list of matching METHODS
                }
            }
        }
        model.addAttribute("mappings", restPaths);
        return "allmappings";
    }
}
