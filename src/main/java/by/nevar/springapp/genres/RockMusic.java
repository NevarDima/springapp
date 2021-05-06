package by.nevar.springapp.genres;

import by.nevar.springapp.Music;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("Artist1(rock) - SongArtist1(rock)");
        rockMusicList.add("Artist2(rock) - SongArtist2(rock)");
        rockMusicList.add("Artist3(rock) - SongArtist3(rock)");
    }

    @PostConstruct
    public void doInit(){
        System.out.println("do init method in RockMusic class");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("do destroy method in RockMusic class");
    }

    @Override
    public List<String> getSongs() {
        return rockMusicList;
    }
}
