package br.com.rafael.exceptions.finally_;

public class Test {
    public static void main(String[] args) {

    }

    private static void openFile(String path){
        try {
            //This line opens the file...
            System.out.println("File at " + path + " opened");
            //This line reads the file...
            System.out.println("File read");
            //This line writes on the file...
            System.out.println("File written");
        } catch(Exception whatever) {
            System.out.println("Exception caught when handling the file at " + path);
        } finally {
            //Closes the stream with the file at 'path'...
            System.out.println("Resource closed");
        }
    }
}
