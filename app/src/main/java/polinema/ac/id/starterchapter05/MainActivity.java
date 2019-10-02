package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadDipsFragment(View view) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment checkFragment = fm.findFragmentByTag("DIPS_FRAGMENT");
        if (checkFragment != null && checkFragment.isVisible()){
//            System.out.println(checkFragment.isVisible());
//            System.out.println(checkFragment.getTag());
        }else{
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new DipsFragment(),"DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }

    public void loadPushupFragment(View view) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment checkFragment = fm.findFragmentByTag("PUSHUP_FRAGMENT");
        if (checkFragment != null && checkFragment.isVisible()){
//            System.out.println(checkFragment.isVisible());
//            System.out.println(checkFragment.getTag());
        }else{
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new PushupFragment(),"PUSHUP_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void loadHandstandFragment(View view) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment checkFragment = fm.findFragmentByTag("HANDSTAND_FRAGMENT");
        if (checkFragment != null && checkFragment.isVisible()){
//            System.out.println(checkFragment.isVisible());
//            System.out.println(checkFragment.getTag());
        }else{
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new HandstandFragment(),"HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }
}
