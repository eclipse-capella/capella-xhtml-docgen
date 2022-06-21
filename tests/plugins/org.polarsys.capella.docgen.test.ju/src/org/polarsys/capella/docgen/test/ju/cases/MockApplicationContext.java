package org.polarsys.capella.docgen.test.ju.cases;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.Bundle;

/**
 * Mock implementation for IApplicationContext. Used to pass arguments when testing command line services.
 */
public class MockApplicationContext implements IApplicationContext {
  // Mock application arguments
  private final Map<String, String[]> mockAppArguments;
  
  public MockApplicationContext(String[] mockCommandLineArguments) {
    Map<String, String[]> appArguments =  new HashMap<>();
    appArguments.put(IApplicationContext.APPLICATION_ARGS, mockCommandLineArguments);
    mockAppArguments = Collections.unmodifiableMap(appArguments);
  }
  
  @SuppressWarnings("rawtypes")
  @Override
  public Map getArguments() {
    return mockAppArguments;
  }

  @Override
  public void applicationRunning() {
  }

  @Override
  public String getBrandingApplication() {
    return null;
  }

  @Override
  public String getBrandingName() {
    return null;
  }

  @Override
  public String getBrandingDescription() {
    return null;
  }

  @Override
  public String getBrandingId() {
    return null;
  }

  @Override
  public String getBrandingProperty(String key) {
    return null;
  }

  @Override
  public Bundle getBrandingBundle() {
    return null;
  }

  @Override
  public void setResult(Object result, IApplication application) {
  }
}