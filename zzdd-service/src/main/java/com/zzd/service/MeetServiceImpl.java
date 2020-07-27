package com.zzd.service;

import com.zzd.bean.Meet;
import com.zzd.dao.MeetDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class MeetServiceImpl implements MeetService{
    @Resource
    private MeetDao meetDao;
    @Override
    public List list() {
        return meetDao.list();
    }

    @Override
    public List selectType() {
        return meetDao.selectType();
    }

    @Override
    public void add(Meet meet) {
        meetDao.add(meet);
    }

    @Override
    public Map selectOne(Integer id) {
        return meetDao.selectOne(id);
    }

    @Override
    public void update(Meet meet) {
        meetDao.update(meet);
    }


}
