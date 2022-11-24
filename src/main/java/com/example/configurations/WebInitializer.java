package com.example.configurations;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{JPAConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
//        root.register(WebConfig.class);
//        servletContext.addListener(new ContextLoaderListener(root));
//        ServletRegistration.Dynamic registration = servletContext.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/");
//    }
}
