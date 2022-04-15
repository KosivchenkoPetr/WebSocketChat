package com.petproject.javachat.repository;

import com.petproject.javachat.model.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {

    //List<ChatMessage> findBySender(String sender);
}
