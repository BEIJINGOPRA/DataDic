package com.bupt.cad.datadic.model.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/9:18
 * @Description:
 */

@Data
@Accessors(chain = true)
public class DataSource implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private String type;

    private String description;

    private String detailInfo;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
