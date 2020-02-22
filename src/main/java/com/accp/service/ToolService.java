package com.accp.service;

import com.accp.domain.ClientClientdata;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class ToolService{

    public int nextIntNoRepeat() {
        int r = (int)(Math.random()*9);
        return r;
    }

}
