package by.nevar.springapp.genres;

import by.nevar.springapp.Music;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    private List<String> rapMusicList = new ArrayList<>();
    {
        rapMusicList.add("Artist1(rap) - SongArtist1(rap)");
        rapMusicList.add("Artist2(rap) - SongArtist2(rap)");
        rapMusicList.add("Artist3(rap) - SongArtist3(rap)");
    }

    @PostConstruct
    public void doInit(){
        System.out.println("do init method in RapMusic class");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("do destroy method in RapMusic class");
    }

    public List<String> getSongs() {
        return rapMusicList;
    }
}
