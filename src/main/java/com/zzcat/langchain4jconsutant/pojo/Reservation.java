package com.zzcat.langchain4jconsutant.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cat
 * @since 2025-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("reservation")
@AllArgsConstructor
@NoArgsConstructor
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 考生姓名
     */
    private String name;

    /**
     * 考生性别
     */
    private String gender;

    /**
     * 考生手机号
     */
    private String phone;

    /**
     * 沟通时间
     */
    private LocalDateTime communicationTime;

    /**
     * 考生所处的省份
     */
    private String province;

    /**
     * 考生预估分数
     */
    private Integer estimatedScore;


}
