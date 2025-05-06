package com.example.jooqfirstlook.film;

import com.example.jooqfirstlook.web.FilmWithActorPagedResponse;
import com.example.jooqfirstlook.web.PagedResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmWithActorPagedResponse getFilmActorPageResponse(Long page, Long pageSize) {
        List<FilmWithActor> filmWithActorList = filmRepository.findFilmWithActorList(page, pageSize);

        PagedResponse pagedResponse = new PagedResponse(page, pageSize);
        List<FilmWithActorPagedResponse.FilmActorResponse> list = filmWithActorList
                .stream()
                .map(FilmWithActorPagedResponse.FilmActorResponse::new)
                .toList();
        return new FilmWithActorPagedResponse(pagedResponse, list);
    }
}
