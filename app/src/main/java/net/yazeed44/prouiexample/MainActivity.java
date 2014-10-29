package net.yazeed44.prouiexample;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView introVideo = (VideoView)findViewById(R.id.videoView);

        final Uri introVideoUri = Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.intro);

        introVideo.setVideoURI(introVideoUri);


        final MediaController mediaControl = new MediaController(this);

        mediaControl.setAnchorView(introVideo);
        introVideo.setMediaController(mediaControl);


        introVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        introVideo.start();




    }





}
