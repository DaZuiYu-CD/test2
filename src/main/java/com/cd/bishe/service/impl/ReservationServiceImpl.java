package com.cd.bishe.service.impl;

import com.cd.bishe.domain.Reservation;
import com.cd.bishe.mapper.ReservationMapper;
import com.cd.bishe.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationMapper reservationMapper;

    @Override
    public int deleteByPrimaryKey(Integer rId) {
        return reservationMapper.deleteByPrimaryKey(rId);
    }

    @Override
    public int insert(Reservation record) {
        return reservationMapper.insert(record);
    }

    @Override
    public Reservation selectByPrimaryKey(Integer rId) {
        return reservationMapper.selectByPrimaryKey(rId);
    }

    @Override
    public List<Reservation> selectAll() {
        return reservationMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Reservation record) {
        return reservationMapper.updateByPrimaryKey(record);
    }
}
