package com.manas.com.manas.controller;

import com.manas.com.manas.model.Show;
import com.manas.com.manas.model.Episode;
import com.manas.com.manas.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/shows")
@CrossOrigin
public class ShowController {
    @Autowired
    private ShowService showService;

    @GetMapping
    public List<Show> getAll() { return showService.getAllShows(); }

    @PostMapping
    public Show add(@RequestBody Show show) { return showService.addShow(show); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { showService.deleteShow(id); }

    @GetMapping("/search")
    public List<Show> search(@RequestParam String title) { return showService.searchShows(title); }

    @PostMapping("/favorite/{id}")
    public Show favorite(@PathVariable Long id) { return showService.toggleFavorite(id); }

    @PostMapping("/{id}/episodes")
    public Episode addEpisode(@PathVariable Long id, @RequestBody Episode episode) {
        return showService.addEpisodeToShow(id, episode);
    }
}