package cn.xmjar.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Version: 1.0
 * @Time: 9:56
 */
@Data
public class Admin implements Serializable {
    private String aid,password;
}
