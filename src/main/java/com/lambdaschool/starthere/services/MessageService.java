package com.lambdaschool.starthere.services;


import com.lambdaschool.starthere.models.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface MessageService {

    Ticket findByMessagesTicket(Ticket ticket);

    String createNewMessage(Ticket ticket);

    String sendMessage(Ticket selectedTicket, String loggedInUser, String messageToSend, Date messageDate);

    ArrayList<String[]> getMessages(Ticket selectedTicket);

}