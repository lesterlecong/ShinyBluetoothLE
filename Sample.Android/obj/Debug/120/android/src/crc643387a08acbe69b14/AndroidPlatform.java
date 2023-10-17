package crc643387a08acbe69b14;


public class AndroidPlatform
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.lifecycle.LifecycleObserver
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_OnResume:()V:__export__\n" +
			"n_OnPause:()V:__export__\n" +
			"";
		mono.android.Runtime.register ("Shiny.AndroidPlatform, Shiny.Core", AndroidPlatform.class, __md_methods);
	}


	public AndroidPlatform ()
	{
		super ();
		if (getClass () == AndroidPlatform.class)
			mono.android.TypeManager.Activate ("Shiny.AndroidPlatform, Shiny.Core", "", this, new java.lang.Object[] {  });
	}

	public AndroidPlatform (android.app.Application p0)
	{
		super ();
		if (getClass () == AndroidPlatform.class)
			mono.android.TypeManager.Activate ("Shiny.AndroidPlatform, Shiny.Core", "Android.App.Application, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	@androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)

	public void OnResume ()
	{
		n_OnResume ();
	}

	private native void n_OnResume ();

	@androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE)

	public void OnPause ()
	{
		n_OnPause ();
	}

	private native void n_OnPause ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
