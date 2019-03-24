package com.musicdemp.maestro;

import com.musicdemp.maestro.equipment.ActionPlayer;
import com.musicdemp.maestro.tool.TrackCounter;
import com.musicdemp.maestro.track.TrackInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaestroApplicationTests {

	@Autowired
	TrackCounter track;

	@Autowired
	@Qualifier("CDplayer")
	ActionPlayer player;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testTrackCounter() {

		List<TrackInfo> listInfo = new ArrayList<TrackInfo>();
		listInfo.add(new TrackInfo("author1", "title1"));
		listInfo.add(new TrackInfo("author2", "title2"));

		player.registerData(listInfo);
		TrackInfo trackInfo = player.getInfoTrack(2);

		player.playTrack(2);
		player.playTrack(2);

		assertEquals("author2", trackInfo.getAuthor());
		assertEquals("title2", trackInfo.getTitle());

		assertEquals(2 , track.getPlayedCount(2));

	}

}
