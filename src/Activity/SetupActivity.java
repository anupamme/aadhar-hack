package Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.example.aadhaarhack.R;


public class SetupActivity extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_setup);
		FragmentManager fmr = getSupportFragmentManager();
		fmr.beginTransaction().add(R.id.activity_setup_container, null).commit(); //CHANGE PENDING TO ADD CORRECT FRAGMENT

	}
}
