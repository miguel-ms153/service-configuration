package com.mamm.msa.booking_microservice.repository;

import com.mamm.msa.booking_microservice.model.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository  extends JpaRepository<BookingEntity, Long> {
}
