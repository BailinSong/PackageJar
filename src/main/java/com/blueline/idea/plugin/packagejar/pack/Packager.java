

package com.blueline.idea.plugin.packagejar.pack;

import com.intellij.openapi.compiler.CompileStatusNotification;

public abstract class Packager implements CompileStatusNotification {
    public abstract void pack();
}
