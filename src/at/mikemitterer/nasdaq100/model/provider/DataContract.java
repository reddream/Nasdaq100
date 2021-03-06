package at.mikemitterer.nasdaq100.model.provider;

import android.net.Uri;

public final class DataContract {
	private static final String	SCHEME		= "content://";
	public static final String	AUTHORITY	= "at.mikemitterer.nasdaq100.model.provider.DataProvider";	// muss mit der Authority im Manifest zusammenstimmen.

	public static final class MimeTypes {
		public static final String	STOCKINFO_TYPE		= "vnd.android.cursor.dir/vnd.mikemitterer.nasdaq100.stockinfo";
		public static final String	STOCKINFO_ITEM_TYPE	= "vnd.android.cursor.item/vnd.mikemitterer.nasdaq100.stockinfo";
	}

	public static final class StockInfos {
		public static final String	PATH	= "stockinfos";
		public static final String	PATH_ID	= PATH + "/";

		public static final Uri		URI		= Uri.parse(SCHEME + AUTHORITY + "/" + PATH);
		public static final Uri		URI_ID	= Uri.parse(SCHEME + AUTHORITY + "/" + PATH_ID);
	}

}
