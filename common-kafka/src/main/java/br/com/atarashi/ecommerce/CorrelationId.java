package br.com.atarashi.ecommerce;

public class CorrelationId {

    private final String id;

    CorrelationId() {
        id = java.util.UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "CorrelationId{" +
                "id='" + id + '\'' +
                '}';
    }
}
