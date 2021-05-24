package spring_basics;

public class MovieLister {
    private MovieLister movieFinder;
    public void SimpleMovieLister(MovieLister movieFinder) {
        this.movieFinder = movieFinder;
    }
}
