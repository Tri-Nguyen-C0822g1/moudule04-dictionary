package com.example.controller;

import com.example.model.Dictionary;
import com.example.service.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DictionaryController {
    DictionaryService dictionaryService = new DictionaryService();
    @GetMapping({"/","/dictionary"})
public String showDictionaryForm(){
        return "index";
    }

    @PostMapping("/translate")
    public ModelAndView translateToEng(@RequestParam String key) {

        List<Dictionary> dictionaries = dictionaryService.findAll();
        ModelAndView modelAndView = null;
        for (Dictionary d : dictionaries) {
            if (key.equalsIgnoreCase(d.getEn())) {
                modelAndView = new ModelAndView("index");;

                modelAndView.addObject("en", key);
                modelAndView.addObject("vn", d.getVn());

                return modelAndView;
            }
        }
        return null;
    }


}
