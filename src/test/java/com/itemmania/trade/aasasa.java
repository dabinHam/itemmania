package com.itemmania.trade;

import com.itemmania.repository.MileageRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@SpringBootTest
public class aasasa {


    @Autowired
    MileageRepository mileageRepository;

    @Test
    public void aa() {
        int distinctByUserNum = mileageRepository.findTop1ByUserNum(5);

        log.info("김주환"+distinctByUserNum);


    }
}
