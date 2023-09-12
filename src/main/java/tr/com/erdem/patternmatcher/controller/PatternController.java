package tr.com.erdem.patternmatcher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.erdem.patternmatcher.yardimci.PatternMatcher;

@RestController
public class PatternController {
    @GetMapping("test")
    public String test(){
        PatternMatcher patternMatcher=new PatternMatcher();
        patternMatcher.macthingResult();
        return "uygulama çalışıyor";
    }
}
