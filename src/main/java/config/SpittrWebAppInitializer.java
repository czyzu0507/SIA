package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses () {
        return new Class<?>[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses () {
        return new Class<?>[]{ WebConfig.class};
    }

    @Override
    protected String[] getServletMappings () {
        return new String[] {"/"};
    }

    @Override
    protected void customizeRegistration (ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("/tmp",2097152L,4194304L,0));
    }
}
