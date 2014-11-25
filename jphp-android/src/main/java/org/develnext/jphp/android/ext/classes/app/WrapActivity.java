package org.develnext.jphp.android.ext.classes.app;

import android.app.Activity;
import android.os.Bundle;
import org.develnext.jphp.android.AndroidApplication;
import org.develnext.jphp.android.ext.AndroidExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.annotation.Reflection.UseJavaLikeNames;
import php.runtime.env.Environment;
import php.runtime.lang.IObject;
import php.runtime.memory.ArrayMemory;
import php.runtime.reflection.ClassEntity;

import java.lang.ref.WeakReference;

@UseJavaLikeNames
@Name(AndroidExtension.NAMESPACE + "app\\Activity")
public class WrapActivity extends Activity implements IObject {
    private boolean isFinalized = false;
    private ClassEntity __class__;
    private WeakReference<Environment> __env__;
    private ArrayMemory __props__ = new ArrayMemory();

    public WrapActivity() {
    }

    @Signature
    public Memory __construct(Environment env, Memory... args) {
        return Memory.NULL;
    }

    @Signature
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        __env__   = new WeakReference<Environment>( AndroidApplication.INSTANCE.getEnvironment() );
        __class__ = __env__.get().fetchClass(getClass());
    }

    @Override
    public ClassEntity getReflection() {
        return __class__;
    }

    @Override
    public ArrayMemory getProperties() {
        return __props__;
    }

    @Override
    public Environment getEnvironment() {
        return __env__.get();
    }

    @Override
    public int getPointer() {
        return hashCode();
    }

    @Override
    public boolean isMock() {
        return __class__ == null;
    }

    @Override
    public void setAsMock() {
        __class__ = null;
    }

    @Override
    public boolean isFinalized() {
        return isFinalized;
    }

    @Override
    public void doFinalize() {
        isFinalized = true;
    }
}
