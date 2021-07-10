package structuralDesignPattern.decorator;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message{

    private Message message;

    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return dummyHtmlEncoder(message.getContent());
    }

    private String dummyHtmlEncoder(String s){
        return "Thia is an dummy encoded string for : -" + s;
    }
}
