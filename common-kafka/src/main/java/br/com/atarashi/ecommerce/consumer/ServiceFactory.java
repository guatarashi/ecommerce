package br.com.atarashi.ecommerce.consumer;

public interface ServiceFactory<T> {

    ConsumerService<T> create();
}
