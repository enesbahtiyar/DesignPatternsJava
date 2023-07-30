package BehavioralDesignPatterns.ObserverDesignPattern;

public interface Channel
{
    // To update the news
    void update(String news);

    // To see the latest news on the channel
    void printNews();
}
