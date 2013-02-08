package it.datiaperti.osgi.http;

import java.util.Hashtable;

import javax.servlet.Servlet;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.http.HttpService;

public class HelloWorldActivator implements BundleActivator
{
  private ServiceRegistration registration;

  public void start(BundleContext context) throws Exception 
  {
    Hashtable props = new Hashtable();
    props.put("alias", "/hello");
    props.put("init.message", "Hello World!");

    this.registration = context.registerService(Servlet.class.getName(), new HelloWorld(), props);
  }

  public void stop(BundleContext context) throws Exception 
  {
    this.registration.unregister();
  }
}