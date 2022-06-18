package com.arao.topics.designPatterns.structural.adapter.players;

import com.arao.topics.designPatterns.structural.adapter.MediaAdapter;

// Target class
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String format, String file) {
        // Inbuilt support to play mp3 files
        if (format.equalsIgnoreCase(MediaPlayer.MP3_FORMAT)) {
            System.out.println("MP3 file " + file + " Playing...");
        }

        // Make use of adapter to play different formats
        else if (format.equalsIgnoreCase(MediaPlayer.MP4_FORMAT) || format.equalsIgnoreCase(MediaPlayer.WAV_FORMAT)) {
            mediaAdapter =  new MediaAdapter(format);
            mediaAdapter.play(format, file);
        }

        else {
            System.out.println("Format not supported");
        }
    }
}
