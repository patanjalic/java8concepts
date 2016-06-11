package com.patanjali.java8.chapter4;

import java.util.List;
import java.util.Optional;

public class ArtistsFixed {

    private List<Artist> artists;

    public ArtistsFixed(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            Optional.empty();
        }
        return Optional.of(artists.get(index));
    }

    private void indexException(int index) {
        throw new IllegalArgumentException(index +
                " doesn't correspond to an Artist");
    }

    public String getArtistName(int index) {
        try {
            Optional<Artist> artist = getArtist(index);
            return artist.map(Artist::getName).orElse("unknown");
        } catch (IllegalArgumentException e) {
            return "unknown";
        }
    }

}