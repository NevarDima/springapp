package by.nevar.springapp.genres;

import by.nevar.springapp.Music;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ElectronicMusic implements Music {
    private List<String> electronicMusicList = new ArrayList<>();

    {
        electronicMusicList.add("Artist1(electronic) - SongArtist1(electronic)");
        electronicMusicList.add("Artist2(electronic) - SongArtist2(electronic)");
        electronicMusicList.add("Artist3(electronic) - SongArtist3(electronic)");
    }

    @PostConstruct
    public void doInit(){
        System.out.println("do init method in ElectronicMusic class");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("do destroy method in ElectronicMusic class");
    }

    @Override
    public List<String> getSongs() {
        return electronicMusicList;
    }
}
