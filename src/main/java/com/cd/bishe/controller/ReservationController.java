package com.cd.bishe.controller;

import com.cd.bishe.domain.Reservation;
import com.cd.bishe.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/reservation")
@CrossOrigin
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    @ResponseBody
    @RequestMapping("deleteReservation")
    public int deleteByPrimaryKey(Integer rId) {
        return reservationService.deleteByPrimaryKey(rId);
    }

    @ResponseBody
    @RequestMapping("addReservation")
    public int insert(Reservation record) {
        return reservationService.insert(record);
    }

    @ResponseBody
    @RequestMapping("getReservation")
    public Reservation selectByPrimaryKey(Integer rId) {
        return reservationService.selectByPrimaryKey(rId);
    }

    @ResponseBody
    @RequestMapping("getAllReservation")
    public List<Reservation> selectAll() {
        return reservationService.selectAll();
    }

    @ResponseBody
    @RequestMapping("editReservation")
    public int updateByPrimaryKey(Reservation record) {
        return reservationService.updateByPrimaryKey(record);
    }
}
