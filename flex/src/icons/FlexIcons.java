// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package icons;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * NOTE THIS FILE IS AUTO-GENERATED
 * DO NOT EDIT IT BY HAND, run "Generate icon classes" configuration instead
 */
public final class FlexIcons {
  private static Icon load(String path) {
    return IconLoader.getIcon(path, FlexIcons.class);
  }

  public static final Icon Flash_remote_debug = load("/images/flash_remote_debug.svg"); // 16x16
  public static final Icon Flash_run_config = load("/images/flash_run_config.svg"); // 16x16

  public final static class Flex {
    public static final Icon Flash_builder = load("/images/flex/flash_builder.svg"); // 16x16
    public static final Icon Flash_module_closed = load("/images/flex/flash_module_closed.svg"); // 16x16
    public static final Icon Flexunit = load("/images/flex/flexunit.svg"); // 16x16

    public final static class Sdk {
      public static final Icon Flex_sdk = load("/images/flex/sdk/flex_sdk.svg"); // 16x16
      public static final Icon MavenFlex = load("/images/flex/sdk/mavenFlex.svg"); // 16x16

    }

  }
}
