package whatever.startreksoundboard2;

import android.media.MediaPlayer;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button engage = findViewById(R.id.engage);
        final Button borg1 = findViewById(R.id.borg1);
        final Button kill = findViewById(R.id.kill);
        final Button scorpion = findViewById(R.id.scorpion);
        final Button warpcorebreach = findViewById(R.id.warpcorebreach);
        final MediaPlayer mediaPlayerEngage = MediaPlayer.create(getApplicationContext(), R.raw.engage);
        final MediaPlayer mediaPlayerBorg1 = MediaPlayer.create(getApplicationContext(), R.raw.borg1);
        final MediaPlayer mediaPlayerScorpion = MediaPlayer.create(getApplicationContext(), R.raw.scorpionnfox);
        final MediaPlayer mediaPlayerWarpcorebreach = MediaPlayer.create(getApplicationContext(), R.raw.warpcorebreachsoonerthanyouthink_ep);


        engage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int audioSessionId = mediaPlayerEngage.getAudioSessionId();


                System.out.println("sessionId" + audioSessionId);
                int duration = mediaPlayerEngage.getDuration();

                if (mediaPlayerEngage.isPlaying()) {
                    System.out.println("media player is playing");
                    return;
                }
                mediaPlayerEngage.start();
                System.out.println("duration track: " + duration);
            }
        });

        scorpion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int audioSessionId = mediaPlayerScorpion.getAudioSessionId();


                System.out.println("sessionId" + audioSessionId);
                int duration = mediaPlayerEngage.getDuration();

                if (mediaPlayerScorpion.isPlaying()) {
                    System.out.println("media player is playing");
                    return;
                }
                mediaPlayerScorpion.start();
                System.out.println("duration track: " + duration);
            }
        });

        borg1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int audioSessionId = mediaPlayerBorg1.getAudioSessionId();


                System.out.println("sessionId" + audioSessionId);
                int duration = mediaPlayerBorg1.getDuration();

                if (mediaPlayerBorg1.isPlaying()) {
                    System.out.println("media player is playing");
                    return;
                }
                mediaPlayerBorg1.start();
                System.out.println("duration track: " + duration);
            }
        });

        warpcorebreach.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int audioSessionId = mediaPlayerWarpcorebreach.getAudioSessionId();


                System.out.println("sessionId" + audioSessionId);
                int duration = mediaPlayerWarpcorebreach.getDuration();

                if (mediaPlayerWarpcorebreach.isPlaying()) {
                    System.out.println("media player is playing");
                    return;
                }
                mediaPlayerWarpcorebreach.start();
                System.out.println("duration track: " + duration);
            }
        });
        kill.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (mediaPlayerEngage.isPlaying()) {
                    mediaPlayerEngage.pause();
                    mediaPlayerEngage.seekTo(0);
                }
                if (mediaPlayerBorg1.isPlaying()) {
                    mediaPlayerBorg1.pause();
                    mediaPlayerBorg1.seekTo(0);
                }
                if (mediaPlayerScorpion.isPlaying()) {
                    mediaPlayerScorpion.pause();
                    mediaPlayerScorpion.seekTo(0);
                }
                if (mediaPlayerWarpcorebreach.isPlaying()) {
                    mediaPlayerWarpcorebreach.pause();
                    mediaPlayerWarpcorebreach.seekTo(0);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

        /**
         * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
         * one of the sections/tabs/pages.
         */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    tab1 tab1 = new tab1();
                    return tab1;
                case 1:
                    tab2 tab2 = new tab2();
                    return tab2;
                case 2:
                    tab3 tab3 = new tab3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }
}
