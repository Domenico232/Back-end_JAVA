package com.wpU2sd.repo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpU2sd.entities.Reservation;
import com.wpU2sd.entities.User;


public interface ReservationRepo extends JpaRepository<Reservation, Long> {
    List<Reservation> findByDateAndStartTimeBetween(
            LocalDate date, LocalTime startTime, LocalTime endTime);

    List<Reservation> findByUserAndDate(User user, LocalDate date);
}
