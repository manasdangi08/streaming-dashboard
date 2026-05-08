package com.manas.com.manas.service;

import com.manas.com.manas.model.Show;
import com.manas.com.manas.model.Episode;
import com.manas.com.manas.repository.ShowRepository;
import com.manas.com.manas.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShowService {
    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private EpisodeRepository episodeRepository;

    public List<Show> getAllShows() { return showRepository.findAll(); }
    public Show addShow(Show show) { return showRepository.save(show); }
    public void deleteShow(Long id) { showRepository.deleteById(id); }
    public List<Show> searchShows(String title) { return showRepository.findByTitleContainingIgnoreCase(title); }
    
    public Show toggleFavorite(Long id) {
        Show show = showRepository.findById(id).orElseThrow();
        show.setFavorite(!show.isFavorite());
        return showRepository.save(show);
    }

    public Episode addEpisodeToShow(Long showId, Episode episode) {
        Show show = showRepository.findById(showId).orElseThrow();
        episode.setShow(show);
        return episodeRepository.save(episode);
    }
}