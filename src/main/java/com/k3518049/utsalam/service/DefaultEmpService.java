package com.k3518049.utsalam.service;

import com.k3518049.utsalam.dto.InfoDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("DefaultEmpService")
public class DefaultEmpService implements IGaji{
    @Override
    public Integer gajiPokok() {
        return 4500;
    }

    @Override
    public Integer tunjanganFamily(InfoDto info) {
        return info.getFamily()*30;
    }

    @Override
    public Integer tunjanganOvertime(InfoDto info) {
        return info.getOvertime()*4;
    }
}