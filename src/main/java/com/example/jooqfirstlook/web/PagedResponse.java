package com.example.jooqfirstlook.web;

public record PagedResponse(
        long page,
        long pageSize
) {
}
