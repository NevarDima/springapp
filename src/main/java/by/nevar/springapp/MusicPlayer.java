package by.nevar.springapp;

import by.nevar.springapp.genres.ClassicalMusic;
import by.nevar.springapp.genres.ElectronicMusic;
import by.nevar.springapp.genres.RapMusic;
import by.nevar.springapp.genres.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private List<Music> musicList;

    @Value("${musicPlayer.vol}")
    private String vol;

    @Autowired
    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public void playMusic(){
        Random random = new Random();
        System.out.println(musicList.get(random.nextInt(3)).getSongs().get(random.nextInt(2)));
    }

    public String getVol() {
        return vol;
    }
}
