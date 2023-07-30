package BehavioralDesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency
{
    private String news;

    List<Channel> channelList = new ArrayList<>();

    //registering a channel //subscribing a channel
    public void addObserver(Channel channel)
    {
        channelList.add(channel);
    }

    //removing a channel //unsubscribing a channel
    public void removeObserver(Channel channel)
    {
        channelList.remove(channel);
    }

    // Send "news" content to the subscribed channels
    public void sendNews(String news){
        this.news = news;
        for (Channel channel : channelList)
            channel.update(this.news);
    }
}
