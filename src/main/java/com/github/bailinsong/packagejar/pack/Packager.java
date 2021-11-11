

package com.github.bailinsong.packagejar.pack;

import com.intellij.openapi.compiler.CompileStatusNotification;

public abstract class Packager implements CompileStatusNotification {
    public abstract void pack();
}
