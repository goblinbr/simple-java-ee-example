package com.github.goblinbr.example.web.config;

import com.github.goblinbr.example.web.rest.TestRest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest")
public class RestConfig extends Application {

    private static Set<Class<?>> rests;
    
    @Override
    public Set<Class<?>> getClasses() {
        if( rests == null ){
            rests = new HashSet<>();
            rests.add(TestRest.class);
        }
        return rests;
    }

}