/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FilmCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long filmId;
    private Long categoryId;
    private LocalDateTime lastUpdate;

    public FilmCategory() {}

    public FilmCategory(FilmCategory value) {
        this.filmId = value.filmId;
        this.categoryId = value.categoryId;
        this.lastUpdate = value.lastUpdate;
    }

    public FilmCategory(
        Long filmId,
        Long categoryId,
        LocalDateTime lastUpdate
    ) {
        this.filmId = filmId;
        this.categoryId = categoryId;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>sakila.film_category.film_id</code>.
     */
    public Long getFilmId() {
        return this.filmId;
    }

    /**
     * Setter for <code>sakila.film_category.film_id</code>.
     */
    public FilmCategory setFilmId(Long filmId) {
        this.filmId = filmId;
        return this;
    }

    /**
     * Getter for <code>sakila.film_category.category_id</code>.
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * Setter for <code>sakila.film_category.category_id</code>.
     */
    public FilmCategory setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Getter for <code>sakila.film_category.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.film_category.last_update</code>.
     */
    public FilmCategory setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final FilmCategory other = (FilmCategory) obj;
        if (this.filmId == null) {
            if (other.filmId != null)
                return false;
        }
        else if (!this.filmId.equals(other.filmId))
            return false;
        if (this.categoryId == null) {
            if (other.categoryId != null)
                return false;
        }
        else if (!this.categoryId.equals(other.categoryId))
            return false;
        if (this.lastUpdate == null) {
            if (other.lastUpdate != null)
                return false;
        }
        else if (!this.lastUpdate.equals(other.lastUpdate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.filmId == null) ? 0 : this.filmId.hashCode());
        result = prime * result + ((this.categoryId == null) ? 0 : this.categoryId.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FilmCategory (");

        sb.append(filmId);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
