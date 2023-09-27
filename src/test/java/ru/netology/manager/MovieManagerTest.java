package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    String Film1 = "Film1";
    String Film2 = "Film2";
    String Film3 = "Film3";
    String Film4 = "Film4";
    String Film5 = "Film5";
    String Film6 = "Film6";
    String Film7 = "Film7";

    @Test
    public void emptyFieldFilms() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void twoFilms() {
        MovieManager manager = new MovieManager();

        manager.addMovie(Film1);

        String[] expected = {Film1};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FilmsInTheMiddle() {
        MovieManager manager = new MovieManager();

        manager.addMovie(Film1);
        manager.addMovie(Film2);
        manager.addMovie(Film3);
        manager.addMovie(Film4);
        manager.addMovie(Film5);

        String[] expected = {Film1, Film2, Film3, Film4, Film5};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void equalToTheLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie(Film1);
        manager.addMovie(Film2);
        manager.addMovie(Film3);
        manager.addMovie(Film4);
        manager.addMovie(Film5);

        String[] expected = {Film5, Film4, Film3, Film2, Film1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lessThanLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie(Film1);
        manager.addMovie(Film2);
        manager.addMovie(Film3);
        manager.addMovie(Film4);

        String[] expected = {Film4, Film3, Film2, Film1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moreThanThLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie(Film1);
        manager.addMovie(Film2);
        manager.addMovie(Film3);
        manager.addMovie(Film4);
        manager.addMovie(Film5);
        manager.addMovie(Film6);

        String[] expected = {Film6, Film5, Film4, Film3, Film2};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
