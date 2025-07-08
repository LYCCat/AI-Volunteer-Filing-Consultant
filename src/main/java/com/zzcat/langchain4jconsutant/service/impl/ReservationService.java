package com.zzcat.langchain4jconsutant.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzcat.langchain4jconsutant.mapper.ReservationMapper;
import com.zzcat.langchain4jconsutant.pojo.Reservation;
import com.zzcat.langchain4jconsutant.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService  extends ServiceImpl<ReservationMapper,Reservation> implements IReservationService  {
    @Autowired
   private  ReservationMapper reservationMapper;

    @Override
    public Reservation findByPhone(String phone) {
        QueryWrapper<Reservation> que = new QueryWrapper<>();
        que.eq("phone",phone);
        return reservationMapper.selectOne(que);
    }
}
