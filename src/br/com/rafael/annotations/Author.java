package br.com.rafael.annotations;

import java.lang.annotation.Documented;

@Documented //To make that this annotation information appears in the javadoc.
public @interface Author {
    String author();
    String date();
    int currentRevision() default 1; //Optional default values.
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    String[] reviewers();
}
