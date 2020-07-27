package com.zzd.service;

import com.zzd.bean.Meet;

import java.util.List;
import java.util.Map;

public interface MeetService {
    List list();
    List selectType();

    void add(Meet meet);

    Map selectOne(Integer id);

    void update(Meet meet);
}
