package br.com.atarashi.ecommerce;

public class CorrelationId {

    private final String id;

    CorrelationId(String title) {
        id = title + "(" + java.util.UUID.randomUUID() + ")";
    }

    @Override
    public String toString() {
        return "CorrelationId{" +
                "id='" + id + '\'' +
                '}';
    }

    public CorrelationId continueWith(String title) {
        return new CorrelationId(id + "-" + title);
    }
}
