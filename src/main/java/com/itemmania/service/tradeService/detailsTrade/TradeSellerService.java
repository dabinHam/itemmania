package com.itemmania.service.tradeService.detailsTrade;

import com.itemmania.entity.BoardEntity;
import com.itemmania.entity.TradeEntity;
import com.itemmania.repository.BoardRepository;
import com.itemmania.repository.TradeRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class TradeSellerService {


    @Autowired
    private TradeRepository tradeRepository;


    public List<TradeEntity> getTradeSeller() {
        List<TradeEntity> byTradeIsSuccessIsNull = tradeRepository.findAllByTradeIsSuccessNull();

        log.info("byTradeIsSuccessIsNull?" + byTradeIsSuccessIsNull);


        return byTradeIsSuccessIsNull;

    }


}
