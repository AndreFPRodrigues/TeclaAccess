package ca.idi.tecla.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TeclaReceiver extends BroadcastReceiver
{

	@Override
	public void onReceive(Context context, Intent intent)
	{	
		String action = intent.getAction();
		
		if (action.equals(Intent.ACTION_BOOT_COMPLETED))
		{
			TeclaCommon.startTeclaService(context);
		}
	}
	
}
