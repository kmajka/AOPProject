package com.musicdemo.maestro.equipment;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StoreData<T> {

    private List<T> playlist;

    public List<T> getPlaylist() {
        return playlist;
    }

    public StoreData() {
        playlist = new ArrayList<T>();
    }

    public void addList(List<T> t) {
        playlist.addAll(t);
    }

    public void add(T t) {
        playlist.add(t);
    }

    public void remove(T t) {
        playlist.remove(t);
    }

    public T get(int i) {
        if (playlist.size() < i) {
            return null;
        }
        return playlist.get(i);
    }

    public void clearStore() {
        playlist.clear();
    }
}
