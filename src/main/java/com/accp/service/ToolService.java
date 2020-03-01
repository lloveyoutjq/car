package com.accp.service;

import com.accp.domain.ClientClientdata;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

@Service
public class ToolService{

    public int nextIntNoRepeat() {
        int r = (int)(Math.random()*9);
        return r;
    }


    /**
     * object -> BigDecimal 转换.
     * @param value
     * @return
     */
    public static BigDecimal getBigDecimal(Object value) {
        BigDecimal ret = null;
        if (value != null) {
            if (value instanceof BigDecimal) {
                ret = (BigDecimal) value;
            } else if (value instanceof String) {
                ret = new BigDecimal((String) value);
            } else if (value instanceof BigInteger) {
                ret = new BigDecimal((BigInteger) value);
            } else if (value instanceof Number) {
                //转成String类型，然后new
                ret = new BigDecimal(value.toString());
            } else {
                throw new ClassCastException("Not possible to coerce [" + value + "] from class "
                        + value.getClass() + " into a BigDecimal.");
            }
        }
        return ret;
    }

}
