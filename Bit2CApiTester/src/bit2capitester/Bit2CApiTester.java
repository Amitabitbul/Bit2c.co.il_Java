package bit2capitester;
import Api.Bit2cClient;
import Enums.CoinType;
import Enums.PairType;
import Objects.*;
import java.math.BigDecimal;
import java.util.ArrayList;
/**
 *
 * @author AMiT
 */
public class Bit2CApiTester {

    public static void main(String[] args) throws Exception {
        Bit2cClient client = new Bit2cClient("https://www.bit2c.co.il/","api-key","api-secret");
        
        /* Get User Balance Example
        UserBalance b = client.Balance();
        System.out.println(b.BalanceBTC.toPlainString());
                */
        
        /* Get Trades Example */
        //ArrayList<ExchangesTrade> trades = client.GetTrades(PairType.BtcNis, Long.MIN_VALUE, Double.NaN);
        
        /* Get Ticker Example */
        //Ticker ticker = client.GetTicker(PairType.BtcNis);
        
        /* Get OrderBook Example */
        //OrderBook orderBook = client.GetOrderBook(PairType.BtcNis);
        
        // Add Order Example
        /*OrderData data = new OrderData();
        data.Amount = BigDecimal.valueOf(1.234);
        data.IsBid = true;
        data.Pair = PairType.BtcNis;
        data.Price = BigDecimal.valueOf(3600);
        data.Total = data.Amount.multiply(data.Price);
        AddOrderResponse addOrder = client.AddOrder(data);*/
        
        /* Get All My Orders */
        //Orders order = client.MyOrders(PairType.BtcNis);
        
        /*Get Account History*/
        //ArrayList<AccountRaw> accountRaws = client.AccountHistory(null, null);
        
        /* Cancel Order Example 
        CheckoutResponse response = client.CancelOrder(123456);
        */
        
        /* Clear All My Orders 
        client.ClearMyOrders();
        */
        
        /* Create a Checkout Request Example*/
        /*CheckoutLinkModel data = new CheckoutLinkModel();
        data.CancelURL = "";
        data.ReturnURL = "";
        data.CoinType = CoinType.BTC;
        data.Description = "By Java Api!";
        data.NotifyByEmail = true;
        data.Price = BigDecimal.valueOf(3424);
        
        CheckoutResponse response = client.CreateCheckout(data);*/
    }
    
}
