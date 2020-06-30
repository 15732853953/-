package com.lening.utils;

import java.io.Serializable;

/**
 * 创作时间：2020/6/15 16:10
 * 作者：李增强
 */
public class ResultVo implements Serializable {
    private boolean flag;
    private String msg;

    public ResultVo() {
    }

    public ResultVo(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
