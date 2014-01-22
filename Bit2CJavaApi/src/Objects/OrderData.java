/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;

import java.math.BigDecimal;
import Enums.PairType;
/**
 *
 * @author AMiT
 */
public class OrderData {
    public BigDecimal Amount;
    public BigDecimal Price;
    public BigDecimal Total;
    public boolean IsBid;
    public PairType Pair;
}
