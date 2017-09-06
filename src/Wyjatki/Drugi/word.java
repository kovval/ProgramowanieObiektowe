package Wyjatki.Drugi;

import com.sun.nio.sctp.IllegalReceiveException;
import com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationsException;

/**
 * Created by RENT on 2017-09-06.
 */
public class word {
    public String findElement(String[] strArr, String element){
        for (int i = 0; i < strArr.length ; i++) {
            if(element.equals(strArr[i])) {
                return element;
            }
        }
        throw new ArrayStoreException("Nie znaleziono elementu");
    }
}
