package com.goodskill.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户鉴权服务响应
 * @author techa03
 * @since 2020/12/26
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AuthResponseDTO {
    /**
     * token
     */
    private String token;
    /**
     * 刷新token时传入的主键
     */
    private String refreshKey;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 响应code
     */
    private String code;
    /**
     * 响应信息
     */
    private String message;
}
