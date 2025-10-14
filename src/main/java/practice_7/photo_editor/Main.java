package practice_7.photo_editor;

public class Main {
    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();

        photoEditor.addNewAction("1");
        photoEditor.addNewAction("2");
        photoEditor.addNewAction("3");
        photoEditor.addNewAction("4");
        photoEditor.addNewAction("5");

        photoEditor.printActions();

        photoEditor.undoAction();
        photoEditor.undoAction();
        photoEditor.undoAction();
        photoEditor.undoAction();
        photoEditor.printActions();

    }
}
