package ru.netology.domain;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MovieManager {
    private int neededQuantityToGet = 10;


    MovieItems[] movies  = {
            new MovieItems(1, "Бладшот", "боевик"),
            new MovieItems(2, "Вперед", "мультфильм"),
            new MovieItems(3, "Отель ''Белград''", "комедия"),
            new MovieItems(4, "Джентльмены", "боевик"),
            new MovieItems(5, "Человек-невидимка", "ужасы"),
            new MovieItems(6, "Тролли.Мировой тур", "мультфильм"),
            new MovieItems(7,"Номер один","комедия")
    };

    public MovieManager(int neededQuantityToGet) {
        this.neededQuantityToGet = neededQuantityToGet;
    }

    public void add(MovieItems movie) {
        int length = movies.length + 1;
        MovieItems[] tmp = new MovieItems[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
    int lastIndex = length -1 ;
        tmp[lastIndex] = movie;
        movies= tmp;
    }

    public MovieItems[] getAll() {
        int QuantityToGet;
        if (movies.length >= neededQuantityToGet) {
            QuantityToGet = neededQuantityToGet;
        } else {
            QuantityToGet = movies.length;
        }
        MovieItems[] result = new MovieItems[QuantityToGet];
        for (int i = 0; i < QuantityToGet; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }

}
