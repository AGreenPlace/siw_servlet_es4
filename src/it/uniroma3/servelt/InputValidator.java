package it.uniroma3.servelt;


import org.apache.commons.lang.math.NumberUtils;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by Andrea on 29/04/15.
 */
public class InputValidator {
    public static boolean validateInputWithNumerical(HttpServletRequest req,String[] numericalFields){
        boolean output = true;
        Map<String,String[]> inputs = req.getParameterMap();
        for (String key : inputs.keySet()){
            if(inputs.get(key)[0].isEmpty()){
                output = false;
                req.setAttribute(key+"IsEmpty","empty");
                req.setAttribute("errorMessageEmpty", "Attenzione uno o piu' campi sono vuoti");
            }
        }
        if (numericalFields != null) {
            for (String s : numericalFields) {
                if (!NumberUtils.isNumber(req.getParameter(s))) {
                    output = false;
                    req.setAttribute(s + "IsNotNumerical", "notNumerical");
                    req.setAttribute("errorMessageWrongCharacter", "Attenzione uno o piu' campi presentano caratteri non accettabili");
                }
            }
        }
        return output;
    }
}
