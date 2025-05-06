package com.example.jooqfirstlook.web;

import com.example.jooqfirstlook.film.FilmWithActor;

import java.util.List;

public record FilmWithActorPagedResponse(
        PagedResponse pagedResponse,
        List<FilmActorResponse> filmActorList
) {

    public record FilmActorResponse(
            String filmTitle,
            String actorFullName,
            Long filmId
    ) {

        public FilmActorResponse(FilmWithActor filmWithActor) {
            this(filmWithActor.getTitle(), filmWithActor.getFullName(), filmWithActor.getFilmId());
        }
    }
}
