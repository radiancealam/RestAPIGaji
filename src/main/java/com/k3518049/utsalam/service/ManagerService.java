package com.k3518049.utsalam.service;

import com.k3518049.utsalam.dto.InfoDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("ManagerService")
public class ManagerService implements IGaji
{
    @Override
    public Integer gajiPokok() {
        return 3*4500;
    }

    @Override
    public Integer tunjanganFamily(InfoDto info) {
        return info.getFamily()*30;
    }

    @Override
    public Integer tunjanganOvertime(InfoDto info) {
        return info.getOvertime()*10;
    }
}
