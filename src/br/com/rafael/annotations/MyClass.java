package br.com.rafael.annotations;

@Author(
        author = "Rafael Fonseca",
        date = "03-22-2022",
        currentRevision = 3,
        lastModified = "03-22-2022",
        lastModifiedBy = "Rafael Fonseca",
        reviewers = {"Josh Block", "John Dee"}
)
public class MyClass {
    @Override
    public String toString() {
        return "MyClass object at " + super.toString();
    }
}
