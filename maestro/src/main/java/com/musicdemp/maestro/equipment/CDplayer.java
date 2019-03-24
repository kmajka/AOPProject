package com.musicdemp.maestro.equipment;

import com.musicdemp.maestro.track.TrackInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CDplayer implements ActionPlayer {

    private int pos;

    @Autowired
    private StoreData<TrackInfo> storeData;

    @Override
    public void registerData(List<TrackInfo> tracks) {

        storeData.addList(tracks);
        pos = 0;

        System.out.println("-----------CDplayer------------");
        storeData.getPlaylist().stream().forEach(track -> {
            System.out.printf("[" + (++pos) + "] " + "Author: \"%s\" Title: \"%s\" \n", track.getAuthor(), track.getTitle());
        });
        System.out.println("--------------------------------");
    }

    @Override
    public TrackInfo getInfoTrack(int numberTrack) {
        TrackInfo track = storeData.get(numberTrack - 1);
        return track;
    }

    @Override
    public boolean playTrack(int numberTrack) {
        System.out.print("PLAY MUSIC .... ");
        TrackInfo track = getInfoTrack(numberTrack);
        if (track != null) {
            System.out.printf("Author: \"%s\" Title: \"%s\" \n", track.getAuthor(), track.getTitle());
            return true;
        } else {
            System.out.println("Cannot open the track");
        }
        return false;
    }
}
