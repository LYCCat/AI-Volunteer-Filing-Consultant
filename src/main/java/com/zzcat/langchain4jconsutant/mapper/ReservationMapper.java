package com.zzcat.langchain4jconsutant.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzcat.langchain4jconsutant.pojo.Reservation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cat
 * @since 2025-07-08
 */
@Mapper
public interface ReservationMapper extends BaseMapper<Reservation> {

//    Reservation findByPhoneReservation(String phone) {
//        return this.selectOne(new QueryWrapper<Reservation>().eq("phone", phone));
//    }
}
