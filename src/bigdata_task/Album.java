package bigdata_task;
/*
    Created by YS
    2020/10/7 10:35
*/


import java.util.List;

//音乐专辑类
public class Album {
    String name;
    List<Track> tracks;
    String musicians;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public String getMusicians() {
        return musicians;
    }

    public void setMusicians(String musicians) {
        this.musicians = musicians;
    }
}
