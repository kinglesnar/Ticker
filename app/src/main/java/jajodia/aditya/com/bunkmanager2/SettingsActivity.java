package jajodia.aditya.com.bunkmanager2;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.util.Log;
import android.widget.TimePicker;

/**
 * Created by kunalsingh on 22/12/16.
 */

public class SettingsActivity extends PreferenceActivity {

    private static final String TAG ="SettingActivity" ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_screen);


    }
}
