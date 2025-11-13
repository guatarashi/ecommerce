package br.com.atarashi.ecommerce.consumer;

import br.com.atarashi.ecommerce.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerService<T> {

    String getConsumerGroup();
    String getTopic();
    // you may argue that a ConsumerException would be better
    // and its ok, it can be better
    void parse(ConsumerRecord<String, Message<T>> record) throws Exception;
}
