package dosw.bitacora.SemanaDos.patrones.estructurales.adapter;

public class Message {
    private String text;
    private String author;
    private String date;

    public Message(String text, String author, String date) {
        this.text = text;
        this.author = author;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }
}
