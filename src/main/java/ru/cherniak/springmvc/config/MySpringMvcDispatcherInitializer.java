package ru.cherniak.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//change web.xml to this
public class MySpringMvcDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

/*
 <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>/WEB-INF/applicationContextMVC.xml</param-value>
    </init-param> ==
 */

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

// <servlet-mapping>
//    <servlet-name>dispatcher</servlet-name>
//    <url-pattern>/</url-pattern>
//  </servlet-mapping> ==
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
