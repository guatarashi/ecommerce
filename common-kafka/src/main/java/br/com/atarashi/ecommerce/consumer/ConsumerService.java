package br.com.atarashi.ecommerce.consumer;

import br.com.atarashi.ecommerce.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.io.IOException;

public interface ConsumerService<T> {

    String getConsumerGroup();
    String getTopic();
    void parse(ConsumerRecord<String, Message<T>> record) throws IOException;
}
