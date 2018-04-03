package com.ytempest.daydayantis.data;

/**
 * @author ytempest
 *         Description：基本的返回数据
 */
public class BaseDataResult {
    private int errcode;
    private String errmsg;
    private int errdialog;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrdialog() {
        return errdialog;
    }

    public void setErrdialog(int errdialog) {
        this.errdialog = errdialog;
    }
}
