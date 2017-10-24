/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTypedObject extends BulletBase {
	private long swigCPtr;
	
	protected btTypedObject(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTypedObject, normally you should not need this constructor it's intended for low-level usage. */ 
	public btTypedObject(long cPtr, boolean cMemoryOwn) {
		this("btTypedObject", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTypedObject obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_btTypedObject(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btTypedObject(int objectType) {
    this(LinearMathJNI.new_btTypedObject(objectType), true);
  }

  public void setObjectType(int value) {
    LinearMathJNI.btTypedObject_objectType_set(swigCPtr, this, value);
  }

  public int getObjectType() {
    return LinearMathJNI.btTypedObject_objectType_get(swigCPtr, this);
  }

}
