package br.com.rafael.interfaces.ex04.implementations;

import br.com.rafael.interfaces.ex04.interface_.Operable;

// The robotic car example shows an interface being used as an industry standard Application Programming Interface (API).
// APIs are also common in commercial software products. Typically, a company sells a software package that contains
// complex methods that another company wants to use in its own software product. An example would be a package of
// digital image processing methods that are sold to companies making end-user graphics programs. The image processing
// company writes its classes to implement an interface, which it makes public to its customers. The graphics company
// then invokes the image processing methods using the signatures and return types defined in the interface. While the
// image processing company's API is made public (to its customers), its implementation of the API is kept as a closely
// guarded secret—in fact, it may revise the implementation at a later date as long as it continues to implement the
// original interface that its customers have relied on.

public class OperableBMW760i implements Operable {

    @Override
    public int turn (Direction d, double radius, double startSpeed, double endSpeed) {
        //Do turn a BWM into direction in d.
        return 1;
    }

    @Override
    public int changeLanes (Direction d, double startSpeed, double endSpeed) {
        //DO change lanes of a BWM into d.
        return 1;
    }

    @Override
    public int signalTurn (Direction d, boolean signalOn) {
        if (signalOn) {
            //Switch on the light blinker into direction d.
        }
        return 1;
    }

    @Override
    public int getRadarFront(double distanceToCar, double speedOfCar) {
        return 1;
    }

    @Override
    public int getRadarRear(double distanceToCar, double speedOfCar) {
        return 1;
    }
}
