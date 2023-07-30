package BehavioralDesignPatterns.MediatorDesignPattern;

public class MediatorRunner
{
    public static void main(String[] args)
    {
        MessageDispatcher dispatcher = new MessageDispatcher();

        Actor plantPerson = new MessageActor("PlantGuy", dispatcher);
        Actor animalPerson = new MessageActor("AnimalGuy", dispatcher);
        Actor weatherPerson = new MessageActor("WeatherGuy", dispatcher);
        Actor physicsPerson = new MessageActor("PhysicsGuy", dispatcher);


        dispatcher.register("Plants", plantPerson);
        dispatcher.register("Animals", animalPerson);
        dispatcher.register("Weather", weatherPerson);
        dispatcher.register("Physic", physicsPerson);

        //sending questions/messages
        plantPerson.sendMessage("Animals", "how fast can a cheetah go");
        plantPerson.sendMessage("Weather", "how is the weather");
        plantPerson.sendMessage("Physic", "What is gravity");
    }
}
