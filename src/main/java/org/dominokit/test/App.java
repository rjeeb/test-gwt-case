package org.dominokit.test;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    new DefaultChildInterface();
    new DefaultChildInterfaceHandler();
  }
}
