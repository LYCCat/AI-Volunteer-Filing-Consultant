package com.zzcat.langchain4jconsutant.tools;

import com.zzcat.langchain4jconsutant.pojo.Reservation;
import com.zzcat.langchain4jconsutant.service.impl.ReservationService;
import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ReservationTool {
    @Autowired
    private ReservationService reservationService;

    @Tool("预约志愿填报服务")
    public  void addReservation( @P("考生姓名")String name,@P("考生性别")String gender,@P("考生手机号")String phone,@P("预约沟通时间,格式为yyyy-MM-dd'T'HH-mm")String communicationTime,@P("考生所在省份")String province,@P("考生预估分数")String estimatedScore){
        Reservation reservation = new Reservation(null,name,gender,phone,
                LocalDateTime.parse(communicationTime),province,Integer.parseInt(estimatedScore));
        reservationService.save(reservation);
    }
    @Tool("根据考生手机号查询预约单")
    public  Reservation findReservation(@P("考生手机号") String phone) {
        return reservationService.findByPhone(phone);
    }
}
