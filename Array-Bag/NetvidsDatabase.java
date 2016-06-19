/**
 * 
 */
package collections;

import java.util.NoSuchElementException;

/**
 * represents a database of collection Movie
 * @author Souleymane Dia (sould32)
 * @version 2015.09.11
 */
public class NetvidsDatabase implements MovieCollection {

    private int size = 0;
    private Movie[] movie;
    private int capacity = 10;

    /**
     * constructor that create a movie object with 10
     */
    public NetvidsDatabase() {
        movie = new Movie[capacity];
    }

    /*
     * (non-Javadoc)
     * 
     * @see collections.MovieCollection#addMovie(collections.Movie)
     */
    @Override
    /**
     * @param aMovie movie to add
     */
    public boolean addMovie(Movie aMovie) {
        boolean added = true;
        int index = 0;

        if (isfull()) {
            doubleArraySize();
        }
        if (isFound(aMovie, index)) {
            added = false;
            return added;
        } 
        else
        {
            movie[size] = aMovie;
            size++;
            return added;
        }

    }

    /**
     * double the capacity
     */
    private void doubleArraySize() {
        capacity = 2 * capacity;
        Movie[] newMovieBook = new Movie[capacity];
        for (int i = 0; i < size; i++) {
            movie[i] = newMovieBook[i];
        }
        movie = newMovieBook;
    }

    /*
     * (non-Javadoc)
     * 
     * @see collections.MovieCollection#remove(collections.Movie)
     */
    /**
     * @return treu if it is full
     */
    private boolean isfull() {
        return size == capacity;
    }

    // @Override
    /**
     * @param aMovie movie to remove
     * @return the movie to be removed
     */
    public Movie remove(Movie aMovie) {
        int index = 0;
        if (aMovie == null) {
            throw new IllegalArgumentException("Movie is null");
        }
        if (isFound(aMovie, index)) {
            Movie temp;
            temp = movie[index];
            movie[index] = movie[size - 1];
            movie[size - 1] = null;
            size--;
            return temp;
        } 
        else
        {
            throw new NoSuchElementException();
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see collections.MovieCollection#contains(collections.Movie)
     */
    @Override
    public boolean contains(Movie amovie) {
        int index = 0;
        return  (isFound(amovie, index));
    }

    /*
     * (non-Javadoc)
     * 
     * @see collections.MovieCollection#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see collections.MovieCollection#size()
     */
    @Override
    public int size() {
        return size;
    }    

    /*
     * (non-Javadoc)
     * 
     * @see collections.MovieCollection#capacity()
     */
    @Override
    public int capacity() {
        return capacity;
    }

    /**
     * helper method for add, contain and remove
     * 
     * @param aMovie
     *            movie to search for
     * @param index
     *            index of the movie found
     * @return true if the movie is found
     */
    private boolean isFound(Movie aMovie, int index) {
        boolean found = false;
        int counter = 0;
        while (counter < size) {
            if (aMovie.equals(movie[counter])) {
                found = true;
                index = counter;
                break;
            }
            counter++;
        }
        return found;
    }

}
