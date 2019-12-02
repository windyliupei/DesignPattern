package com.windy.cp.adapter.entity.mediaplayerimp;

import com.windy.cp.adapter.entity.AdvancedMediaPlayer;
import com.windy.cp.adapter.entity.MediaPlayer;
import com.windy.cp.adapter.entity.advplayerimp.Mp4Player;
import com.windy.cp.adapter.entity.advplayerimp.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
