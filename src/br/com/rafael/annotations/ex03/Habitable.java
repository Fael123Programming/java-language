package br.com.rafael.annotations.ex03;

public interface Habitable {
    /**
     * @deprecated This method was deprecated because newer and more specific
     * implementations of opening a habitable place were introduced to this interface.
     * Use <i>openFrontDoor<i/> or <i>openBackDoor</i> instead.
     */
    @Deprecated
    void open();

    void openFrontDoor();

    void openBackDoor();
}
