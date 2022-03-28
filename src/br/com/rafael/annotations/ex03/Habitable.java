package br.com.rafael.annotations.ex03;

public interface Habitable {
    /**
     * @deprecated
     * <p>This method was deprecated because newer and more specific
     * implementations of opening a habitable place were introduced to this interface.</p>
     * <p>Use <i>openFrontDoor<i/> or <i>openBackDoor</i> instead.</p>
     */
    @Deprecated
    void open();

    void openFrontDoor();

    void openBackDoor();
}
