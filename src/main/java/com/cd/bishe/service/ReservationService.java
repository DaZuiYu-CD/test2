package com.cd.bishe.service;

import com.cd.bishe.domain.Reservation;

import java.util.List;

public interface ReservationService {
    int deleteByPrimaryKey(Integer rId);

    int insert(Reservation record);

    Reservation selectByPrimaryKey(Integer rId);

    List<Reservation> selectAll();

    int updateByPrimaryKey(Reservation record);
}
