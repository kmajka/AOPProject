package com.musicdemp.maestro;

import com.musicdemp.maestro.equipment.ActionPlayer;
import com.musicdemp.maestro.equipment.CDplayer;
import com.musicdemp.maestro.track.TrackInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MaestroApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(MaestroApplication.class, args);
		ActionPlayer actionPlayer = appContext.getBean(CDplayer.class);

		List<TrackInfo> listInfo = new ArrayList<TrackInfo>();
		listInfo.add(new TrackInfo("Mini Vanili", "Great World"));
		listInfo.add(new TrackInfo("Mini Vanili", "Tini tini"));
		listInfo.add(new TrackInfo("Bethoven", "4 seasons"));
		listInfo.add(new TrackInfo("Europe", "The last coundown"));

		actionPlayer.registerData(listInfo);
		actionPlayer.playTrack(2);
		actionPlayer.playTrack(4);
		actionPlayer.playTrack(10);

	}

}
