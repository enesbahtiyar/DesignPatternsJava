package BehavioralDesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Channel{

    private List<String> newsList = new ArrayList<>();

    @Override
    public void update(String news) {
        newsList.add(news); // A new "news" content has been added to the newsList of this channel.
    }

    @Override
    public void printNews() {
        for (String news : newsList)
            System.out.println(news);
    }
}
