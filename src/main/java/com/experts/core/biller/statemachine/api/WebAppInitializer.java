package com.experts.core.biller.statemachine.api;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WebAppInitializer /*implements WebApplicationInitializer*/ {


   /* @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        WebApplicationContext context = getContext();

        servletContext.addListener(new ContextLoaderListener(context));
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        dispatcherServlet.setDetectAllHandlerAdapters(true);
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", dispatcherServlet);
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");
    }

    private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(VersioningApplication.class);
        context.register(PaymentServiceController.class);
        context.register(PaymentBillPullServiceController.class);
        context.register(CustomerConfig.class);
        context.register(AuthServer.class);
        context.register(AuthserverApplication.class);
        context.register(WebSecurityConfig.class);
        context.register(PaymentPrePaidServiceController.class);
        context.register(PaymentNotificationServiceController.class);
        context.setConfigLocation("com.experts.core.biller.statemachine.api");
        return context;
    }



    @Bean
    public RequestMappingHandlerAdapter annotationMethodHandlerAdapter() {
        final RequestMappingHandlerAdapter annotationMethodHandlerAdapter = new RequestMappingHandlerAdapter();
        List<HttpMessageConverter<?>> httpMessageConverters = new ArrayList<>();
        httpMessageConverters.add(new MappingJackson2HttpMessageConverter());
        annotationMethodHandlerAdapter.setMessageConverters(httpMessageConverters);
        return annotationMethodHandlerAdapter;
    }*/

}