package com.zzd.dao;

import com.zzd.bean.Meet;

import java.util.List;
import java.util.Map;

public interface MeetDao {
    List list();
    List selectType();
    void add(Meet meet);

    Map selectOne(Integer id);
    void update(Meet meet);
}
