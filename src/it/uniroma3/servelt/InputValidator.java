package it.uniroma3.servelt;


import org.apache.commons.lang.math.NumberUtils;
import org.apache.openejb.server.httpd.HttpRequest;
import java.util.*;

/**
 * Created by Andrea on 29/04/15.
 */
public class InputValidator {
    public static boolean validateInputWithNumerical(HttpRequest req,String[] numericalFields){
        boolean output = true;
        Map<String,String> inputs = req.getParameters();

        for (String s : numericalFields){
             if (!NumberUtils.isNumber(s)) {
                 output = false;
                 req.getSession().setAttribute("wrongCharacterIn"+s,"empty");
             }
        }
        return output;
    }
}
