package mono.android.app;

public class ApplicationRegistration {

	public static void registerApplications ()
	{
				// Application and Instrumentation ACWs must be registered first.
		mono.android.Runtime.register ("Sample.Droid.MainApplication, Sample.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", crc6447ed2301e55d778b.MainApplication.class, crc6447ed2301e55d778b.MainApplication.__md_methods);
		
	}
}
