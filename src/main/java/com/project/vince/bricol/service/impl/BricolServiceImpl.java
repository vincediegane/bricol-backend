package com.project.vince.bricol.service.impl;

import com.project.vince.bricol.dto.BricolDTO;
import com.project.vince.bricol.service.BricolService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BricolServiceImpl implements BricolService {
    @Override
    public List<BricolDTO> getAllBricols() {
        List<BricolDTO> bricolDTOS = new ArrayList<>();
        bricolDTOS.add(BricolDTO.builder().id(1L).name("Bricol1").description("Bricol1 description").owner("Peter").handyman("vincent").build());

        return bricolDTOS;
    }
}
