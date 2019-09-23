package com.lambdaschool.starthere.repository;

import com.lambdaschool.starthere.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    Ticket findById(int id);

    List<Ticket> findByAssignedToId(int id);
}