package org.purecelibacy.sadhana.activities.intro;

import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.os.*;

import org.purecelibacy.sadhana.HabitsApplication;
import org.purecelibacy.sadhana.HabitsApplicationComponent;
import org.purecelibacy.sadhana.R;
import org.purecelibacy.sadhana.core.models.ModelFactory;
import org.purecelibacy.sadhana.core.preferences.Preferences;



public class ProfileActivity extends FragmentActivity  {

    protected HabitsApplicationComponent component;

    protected Preferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDependencies();
        setContentView(R.layout.profile);
    }

    private void initDependencies()
    {
        Context appContext = getApplicationContext();
        HabitsApplication app = (HabitsApplication) appContext;
        component = app.getComponent();
        preferences = component.getPreferences();
        LoginFragment.setPreferences(preferences);
    }
    @Override
    public void onBackPressed() {
        // Simply Do noting!
        if(!LoginFragment.isFirstTime)
            super.onBackPressed();
    }

}
