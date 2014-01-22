/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;

import Enums.OrderStatusType;
import Enums.PairType;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author AMiT
 */
public class TradeOrder {
    public BigDecimal a;
    public String d;
    public long id;
    public BigDecimal p;
    public PairType pair;
    public boolean isBid;
    public OrderStatusType s;
}
