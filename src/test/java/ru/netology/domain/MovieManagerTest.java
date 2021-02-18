package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void Shouldadd() {
        MovieManager movieManager = new MovieManager();
        MovieItems movieAdd = new MovieItems(8, "Крепкий орешек", "боевик");
        movieManager.add(movieAdd);
        MovieItems[] expected  = {
                new MovieItems(1, "Бладшот", "боевик"),
                new MovieItems(2, "Вперед", "мультфильм"),
                new MovieItems(3, "Отель ''Белград''", "комедия"),
                new MovieItems(4, "Джентльмены", "боевик"),
                new MovieItems(5, "Человек-невидимка", "ужасы"),
                new MovieItems(6, "Тролли.Мировой тур", "мультфильм"),
                new MovieItems(7,"Номер один","комедия"),
                new MovieItems(8, "Крепкий орешек", "боевик")
        };
        assertArrayEquals(expected, movieManager.movies);

    }
    @Test
    void ShouldgetAll() {
        MovieManager movieManager = new MovieManager();
        MovieItems[] expected  = {
                new MovieItems(7,"Номер один","комедия"),
                new MovieItems(6, "Тролли.Мировой тур", "мультфильм"),
                new MovieItems(5, "Человек-невидимка", "ужасы"),
                new MovieItems(4, "Джентльмены", "боевик"),
                new MovieItems(3, "Отель ''Белград''", "комедия"),
                new MovieItems(2, "Вперед", "мультфильм"),
                new MovieItems(1, "Бладшот", "боевик")
        };
        MovieItems[] actual  = movieManager.getAll();
        assertArrayEquals(expected, actual);


    }
    @Test
    void ShouldgetAllNotFull() {
        MovieManager movieManager = new MovieManager(5);
        MovieItems[] expected  = {
                new MovieItems(7,"Номер один","комедия"),
                new MovieItems(6, "Тролли.Мировой тур", "мультфильм"),
                new MovieItems(5, "Человек-невидимка", "ужасы"),
                new MovieItems(4, "Джентльмены", "боевик"),
                new MovieItems(3, "Отель ''Белград''", "комедия")
        };
        MovieItems[] actual  = movieManager.getAll();
        assertArrayEquals(expected, actual);


    }
}