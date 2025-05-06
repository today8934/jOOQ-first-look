package com.example.jooqfirstlook.film;

import org.jooq.generated.tables.pojos.Actor;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.generated.tables.pojos.FilmActor;

public record FilmWithActor(
    Film film,
    Actor actor,
    FilmActor filmActor
) {
    public String getTitle() {
        return film.getTitle();
    }

    public String getFullName() {
        return actor.getFirstName() + " " + actor.getLastName();
    }

    public Long getFilmId() {
        return film.getFilmId();
    }
}
