package BehavioralDesignPatterns.ObserverDesignPattern;

public class ObserverRunner
{
    public static void main(String[] args)
    {
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewsAgency agency = new NewsAgency();

        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.sendNews("new");

        channel1.printNews();
        channel2.printNews();
        channel3.printNews();
    }
}
