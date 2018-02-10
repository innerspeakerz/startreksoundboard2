package whatever.startreksoundboard2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Sounds extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.sounds, container, false);

        Button engage = rootView.findViewById(R.id.engage);
        Button borg1 = rootView.findViewById(R.id.borg);
        Button kill = rootView.findViewById(R.id.kill);
        final Button scorpion = rootView.findViewById(R.id.scorpion);
        final Button warpcorebreach = rootView.findViewById(R.id.warpcorebreach);

        final MediaPlayer mediaPlayerBorg1 = MediaPlayer.create(getActivity(), R.raw.borg1);
        final MediaPlayer mediaPlayerEngage = MediaPlayer.create(getActivity(), R.raw.engage);
        final MediaPlayer mediaPlayerScorpion = MediaPlayer.create(getActivity(), R.raw.scorpionnfox);
        final MediaPlayer mediaPlayerWarpcorebreach = MediaPlayer.create(getActivity(), R.raw.warpcorebreachsoonerthanyouthink_ep);


        engage.setOnClickListener(new View.OnClickListener() {
            @Override
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
                int duration = mediaPlayerScorpion.getDuration();

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

        return rootView;

    }


}

