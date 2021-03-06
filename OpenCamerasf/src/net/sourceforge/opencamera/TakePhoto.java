package net.sourceforge.opencamera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class TakePhoto extends Activity {
	private static final String TAG = "TakePhoto";
	public static final String TAKE_PHOTO = "net.sourceforge.opencamera.TAKE_PHOTO";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = new Intent(this, CameraActivityNew.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.putExtra(TAKE_PHOTO, true);
		this.startActivity(intent);
		this.finish();
	}

    protected void onResume() {
        super.onResume();
    }
}
