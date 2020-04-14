package com.cd.bishe.mapper;

import com.cd.bishe.domain.Reservation;
import java.util.List;

public interface ReservationMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Reservation record);

    Reservation selectByPrimaryKey(Integer rId);

    List<Reservation> selectAll();

    int updateByPrimaryKey(Reservation record);
}