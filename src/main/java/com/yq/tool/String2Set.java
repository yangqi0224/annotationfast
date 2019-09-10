package com.yq.tool;

import com.yq.exception.URLNullException;
import org.apache.log4j.Logger;

import java.util.Set;

public class String2Set {
    private final static Logger log = Logger.getLogger(String2Set.class);
    public static Set string2Set(String tmp, Set set) throws Exception{

        if (tmp.length() == 0)
            throw new URLNullException("URL pool is null");
        String []urls = tmp.split(",");

        for (String url:urls){
            log.info("url connect to redis server: "+url);
        }
        System.out.println(tmp);

        return set;
    }
}
