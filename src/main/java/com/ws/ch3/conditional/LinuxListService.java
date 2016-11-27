package com.ws.ch3.conditional;

/**
 * Created by martin on 11/27/16.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
