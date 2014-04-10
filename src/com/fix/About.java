package com.fix;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fix.About;

public class About extends Activity
{
  TextView like;
  TextView thread;
  View view;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    this.thread = ((TextView)findViewById(0x7f050007));
    this.like = ((TextView)findViewById(0x7f050009));
  }

   
}