package com.windy.cp.adapter.entity.advplayerimp;

import com.windy.cp.adapter.entity.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //Do nothing
    }
}
