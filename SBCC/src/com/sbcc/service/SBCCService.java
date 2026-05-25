package com.sbcc.service;

import java.util.Map;
import com.sbcc.dao.SBCCBoard;

public class SBCCService {

    SBCCBoard sb = new SBCCBoard();

    public int addPlayerObject(String[] playerDetails) {
        return sb.addPlayerObject(playerDetails);
    }

    public Map<String, Double> findTopPlayerDetails(String playerType) {
        return sb.findTopPlayerDetails(playerType);
    }
}