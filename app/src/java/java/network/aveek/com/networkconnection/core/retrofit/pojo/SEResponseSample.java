
package network.aveek.com.networkconnection.core.retrofit.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SEResponseSample {

    @SerializedName("has_more")
    private Boolean mHasMore;
    @SerializedName("items")
    private List<Item> mItems;
    @SerializedName("quota_max")
    private Long mQuotaMax;
    @SerializedName("quota_remaining")
    private Long mQuotaRemaining;

    public Boolean getHasMore() {
        return mHasMore;
    }

    public void setHasMore(Boolean hasMore) {
        mHasMore = hasMore;
    }

    public List<Item> getItems() {
        return mItems;
    }

    public void setItems(List<Item> items) {
        mItems = items;
    }

    public Long getQuotaMax() {
        return mQuotaMax;
    }

    public void setQuotaMax(Long quotaMax) {
        mQuotaMax = quotaMax;
    }

    public Long getQuotaRemaining() {
        return mQuotaRemaining;
    }

    public void setQuotaRemaining(Long quotaRemaining) {
        mQuotaRemaining = quotaRemaining;
    }

}
