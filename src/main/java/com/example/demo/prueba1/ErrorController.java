package com.example.demo.prueba1;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("showerror")
@ControllerAdvice
public class ErrorController {
    private static final Log LOGGER = LogFactory.getLog(ErrorController.class);
    @RequestMapping("show")
    public String errorLaunch(){
        LOGGER.info("INFO TRACE");
        LOGGER.warn("WARNING TRACE");
        LOGGER.error("ERROR TRACE");
        LOGGER.debug("DEBUG TRACE");
        int c = 4/0;
        return "Test" + c;
    }
}
