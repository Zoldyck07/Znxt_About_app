package com.fix;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

class About1
implements View.OnClickListener
{
public void onClick(View paramView)
{
  Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://forum.xda-developers.com/showthread.php?t=2093511"));
  this.startActivity(localIntent);
}

private void startActivity(Intent localIntent) {
	// TODO Auto-generated method stub
	
}
}
