package tr.com.erdem.patternmatcher.yardimci;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    String line="1;New York;8 336 817";
    Pattern pattern=Pattern.compile("""
                                            (?<index>\\d+);\
                                            (?<city>[ a-zA-Z]+);\
                                            (?<population>[ \\d]+)$""");

    Matcher matcher= pattern.matcher(line);
    public void macthingResult()
    {
        if (matcher.matches()) {
            var index = matcher.group("index");
            var city = matcher.group("city");
            var population = matcher.group("population");
        }
    }


}
