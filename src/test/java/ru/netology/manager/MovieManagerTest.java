package ru.netology.manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    String Film1 = "Бладшот";
    String Film2 = "Вперед";
    String Film3 = "Отель Белград";
    String Film4 = "Джентельмены";
    String Film5 = "Человек-невидимка";
    String Film6 = "Тролли. Мировой тур";
    String Film7 = "Номер 1";

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
    public void addingMoviesInReverseOrder() {
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
}
