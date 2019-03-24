package com.musicdemo.maestro.equipment;

import com.musicdemo.maestro.track.TrackInfo;

import java.util.List;

public interface ActionPlayer {
    boolean playTrack(int numberTrack);
    void registerData(List<TrackInfo> tracks);
    TrackInfo getInfoTrack(int numberTrack);

}
