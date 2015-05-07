package com.packtpub.resteasy.services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by maciek on 07.05.15.
 */

@ApplicationPath("/services")
public class MyRestEasyApplication extends Application {

    private Set<Object> services;

    public MyRestEasyApplication() {
        services = new HashSet<Object>();
        services.add(new PersonService());
    }

    @Override
    public Set<Object> getSingletons() {
        return services;
    }
}
