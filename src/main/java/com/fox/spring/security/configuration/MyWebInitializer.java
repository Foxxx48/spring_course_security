package com.fox.spring.security.configuration;

import com.fox.spring.security.configuration.MyConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{MyConfig.class};
    }

    @Override
    protected String[] getServletMappings() {

        return new String[] {"/"};
    }
}
