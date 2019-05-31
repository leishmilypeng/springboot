package com.lp.service;

import java.util.List;

/**
 * Created by CPR161 on 2016-12-22.
 */
public interface IBaseService {
    void doBefore();

    void doAfter();

    List getAll();
}
