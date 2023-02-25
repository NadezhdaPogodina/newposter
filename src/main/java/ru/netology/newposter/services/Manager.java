
package ru.netology.newposter.services;
public class Manager {

    private String[] films = new String[0];
    private int limit;

    public Manager() {
        this.limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }


    public void add(String film) {
        String[] tmp = new String[films.length + 1];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }


    public String[] allFilms() {

        return films;
    }


    public String[] findLast() {
        int resultLength;

        if (films.length < limit) {
            resultLength = films.length;

        } else {
            resultLength = limit;
        }

        String[] tmp = new String[limit];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}













