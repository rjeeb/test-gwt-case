package org.dominokit.test;

import org.dominokit.test.ChildInterface.ChildInterfaceHandler;

public interface ChildInterface extends ParentInterface<ChildInterfaceHandler> {

  interface ChildInterfaceHandler extends ParentInterfaceHandler {
  }
}
