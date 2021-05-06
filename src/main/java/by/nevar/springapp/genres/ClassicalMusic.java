package by.nevar.springapp.genres;

import by.nevar.springapp.Music;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalMusicList = new ArrayList<>();
    {
        classicalMusicList.add("Artist1(classical) - SongArtist1(classical)");
        classicalMusicList.add("Artist2(classical) - SongArtist2(classical)");
        classicalMusicList.add("Artist3(classical) - SongArtist3(classical)");
    }

    @PostConstruct
    public void doInit(){
        System.out.println("do init method in ClassicalMusic class");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("do destroy method in ClassicalMusic class");
    }

    @Override
    public List<String> getSongs() {
        return classicalMusicList;
    }
}
