package by.nevar.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    public int id;
    public MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer){
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + "\n";
    }

    public void turnOnMusic(){
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getVol());
    }
}
