package br.com.rafael.nested_classes.methodreferences.ex03;

import java.util.Collection;
import java.util.function.Supplier;

public class TransferenceDoer {
    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory
    ) {
        DEST result = collectionFactory.get();
        result.addAll(sourceCollection);
        return result;
    }
}
