package sk.abstract_interface;

/**
 * zoznam url alebo lokacii sablon, ci inych zdrojov
 *
 */
public class Resources {


	public static final String CURRENT_BITCOIN_PRICE_URL = "https://api.coinbase.com/v2/prices/spot?currency=USD";
	public static final String BITCOIN_PRICE_BY_DATE_URL = "https://api.polygon.io/v2/aggs/ticker/X:BTCUSD/range/1/day/*/*?adjusted=true&sort=asc&limit=120&apiKey=ldyZoRBL_rffO_SEOljp6XKuZHahpAdK";

	/**
	 * comment method and other description
	 */
	public static final String COINBASE_ACCOUNT_BY_ID_URL = "https://api.exchange.coinbase.com/accounts/*";

	/**
	 * 
	 */
	public static final String COINBASE_ACCOUNTS_URL = "https://api.exchange.coinbase.com/accounts";

	public static final String APPLICATION_JSON = "application/json";

	private Resources() { }

	
}
