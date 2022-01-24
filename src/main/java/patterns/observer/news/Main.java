package patterns.observer.news;

public class Main {
    public static void main(String[] args) {

        NewsAgency observable = new NewsAgency();
        NewsChanel observer = new NewsChanel();

        observable.addObserver(observer);
        observable.setNews("news");
        System.out.println(observer.getNews());
    }
}
