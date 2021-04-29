package com.k3518049.utsalam.service;

import com.k3518049.utsalam.dto.InfoDto;

public interface IGaji
{
    Integer gajiPokok();
    Integer tunjanganFamily (InfoDto info);
    Integer tunjanganOvertime (InfoDto info);
}
