package cn.com.nobook;

import air.com.adobe.appentry.AppEntry;
import android.view.KeyEvent;

public class SwfActivity extends AppEntry {

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		this.finish();
		return true;
	}
}
