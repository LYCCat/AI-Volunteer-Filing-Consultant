package com.zzcat.langchain4jconsutant.service;

import com.zzcat.langchain4jconsutant.pojo.Reservation;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cat
 * @since 2025-07-08
 */

public interface IReservationService extends IService<Reservation> {

    /**
     * 查找预约信息
     * @param phone
     * @return
     */
    Reservation findByPhone(String phone);
}
