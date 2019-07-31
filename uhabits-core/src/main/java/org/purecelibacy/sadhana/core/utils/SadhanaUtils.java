package org.purecelibacy.sadhana.core.utils;

import org.purecelibacy.sadhana.core.Config;


public class SadhanaUtils {

    public static boolean isContainSadhanaIgnoreCase(String habit) {
        for(String sadhana : Config.SADHANAS) {
            if(sadhana.equalsIgnoreCase(habit))
                return true;
        }
        return false;
    }
}
