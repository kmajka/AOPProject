package com.musicdemp.maestro.equipment;

import com.musicdemp.maestro.track.TrackInfo;

import java.util.List;

public interface ActionPlayer {
    boolean playTrack(int numberTrack);
    void registerData(List<TrackInfo> tracks);
    TrackInfo getInfoTrack(int numberTrack);

}
