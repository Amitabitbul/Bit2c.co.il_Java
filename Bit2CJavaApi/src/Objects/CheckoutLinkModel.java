/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;

import Enums.CoinType;
import java.math.BigDecimal;

/**
 *
 * @author AMiT
 */
public class CheckoutLinkModel {
    public BigDecimal Price;
    public String Description;
    public CoinType CoinType;
    public String ReturnURL;
    public String CancelURL;
    public boolean NotifyByEmail;
}
