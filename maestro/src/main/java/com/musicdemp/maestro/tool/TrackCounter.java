package com.musicdemp.maestro.tool;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class TrackCounter {

    Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();

    @Pointcut ("execution (* com.musicdemp.maestro.equipment.CDplayer.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber) {
    }

    @Before("trackPlayed(trackNumber)")
    public void BeforePlay(int trackNumber) {
        System.out.println("Start playing track number: [" + trackNumber + "]");

        int p = getPlayedCount(trackNumber);
        counterMap.put(trackNumber, ++p);
    }

    @After("trackPlayed(trackNumber)")
    public void AfterPlay(int trackNumber) {
        System.out.println("End playing track.");
        System.out.println();
    }

    public int getPlayedCount(int trackNumber) {

        if (counterMap.containsKey(trackNumber)) {
            return counterMap.get(trackNumber);
        }
        return 0;
    }
}
