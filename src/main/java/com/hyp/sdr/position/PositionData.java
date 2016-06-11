package com.hyp.sdr.position;

import java.util.Date;

/**
 * @author Nalin
 *
 */
public class PositionData implements Cloneable {

	private byte exoticTradeInd;
	private byte timePeriodTypeInd;
	private byte putCallInd;
	private byte quoteTypeInd;
	private long tradeNum;
	private long termNum;
	private long strategyNum;
	private long buyerQuoteDefNum;
	private long sellerQuoteDefNum;
	private long refPriceQuoteDefNum;
	private long locationNum;
	private double strikePrice;
	private double spotFX;
	private double riskQty;
	private double riskDelta;
	private double riskMTM;
	private double mark;
	private String iceProductCd;
	private String qtyUOMCd;
	private String delivSchCd;
	private String timePeriodCd;
	private String priceCurrCd;
	private String priceUOMCd;
	private String timezoneCd;
	private String mktSnapshotCd;
	private String serviceLevelCd;
	private String repositoryProductId;
	private Date pricingStartDate;
	private Date pricingEndDate;
	private Date cobDate;
	private Date lastModifyDate;

	public byte getExoticTradeInd() {
		return exoticTradeInd;
	}

	public void setExoticTradeInd(byte exoticTradeInd) {
		this.exoticTradeInd = exoticTradeInd;
	}

	public byte getTimePeriodTypeInd() {
		return timePeriodTypeInd;
	}

	public void setTimePeriodTypeInd(byte timePeriodTypeInd) {
		this.timePeriodTypeInd = timePeriodTypeInd;
	}

	public byte getPutCallInd() {
		return putCallInd;
	}

	public void setPutCallInd(byte putCallInd) {
		this.putCallInd = putCallInd;
	}

	public byte getQuoteTypeInd() {
		return quoteTypeInd;
	}

	public void setQuoteTypeInd(byte quoteTypeInd) {
		this.quoteTypeInd = quoteTypeInd;
	}

	public long getTradeNum() {
		return tradeNum;
	}

	public void setTradeNum(long tradeNum) {
		this.tradeNum = tradeNum;
	}

	public long getTermNum() {
		return termNum;
	}

	public void setTermNum(long termNum) {
		this.termNum = termNum;
	}

	public long getStrategyNum() {
		return strategyNum;
	}

	public void setStrategyNum(long strategyNum) {
		this.strategyNum = strategyNum;
	}

	public long getBuyerQuoteDefNum() {
		return buyerQuoteDefNum;
	}

	public void setBuyerQuoteDefNum(long buyerQuoteDefNum) {
		this.buyerQuoteDefNum = buyerQuoteDefNum;
	}

	public long getSellerQuoteDefNum() {
		return sellerQuoteDefNum;
	}

	public void setSellerQuoteDefNum(long sellerQuoteDefNum) {
		this.sellerQuoteDefNum = sellerQuoteDefNum;
	}

	public long getRefPriceQuoteDefNum() {
		return refPriceQuoteDefNum;
	}

	public void setRefPriceQuoteDefNum(long refPriceQuoteDefNum) {
		this.refPriceQuoteDefNum = refPriceQuoteDefNum;
	}

	public long getLocationNum() {
		return locationNum;
	}

	public void setLocationNum(long locationNum) {
		this.locationNum = locationNum;
	}

	public double getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(double strikePrice) {
		this.strikePrice = strikePrice;
	}

	public double getSpotFX() {
		return spotFX;
	}

	public void setSpotFX(double spotFX) {
		this.spotFX = spotFX;
	}

	public double getRiskQty() {
		return riskQty;
	}

	public void setRiskQty(double riskQty) {
		this.riskQty = riskQty;
	}

	public double getRiskDelta() {
		return riskDelta;
	}

	public void setRiskDelta(double riskDelta) {
		this.riskDelta = riskDelta;
	}

	public double getRiskMTM() {
		return riskMTM;
	}

	public void setRiskMTM(double riskMTM) {
		this.riskMTM = riskMTM;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public String getIceProductCd() {
		return iceProductCd;
	}

	public void setIceProductCd(String iceProductCd) {
		this.iceProductCd = iceProductCd;
	}

	public String getQtyUOMCd() {
		return qtyUOMCd;
	}

	public void setQtyUOMCd(String qtyUOMCd) {
		this.qtyUOMCd = qtyUOMCd;
	}

	public String getDelivSchCd() {
		return delivSchCd;
	}

	public void setDelivSchCd(String delivSchCd) {
		this.delivSchCd = delivSchCd;
	}

	public String getTimePeriodCd() {
		return timePeriodCd;
	}

	public void setTimePeriodCd(String timePeriodCd) {
		this.timePeriodCd = timePeriodCd;
	}

	public String getPriceCurrCd() {
		return priceCurrCd;
	}

	public void setPriceCurrCd(String priceCurrCd) {
		this.priceCurrCd = priceCurrCd;
	}

	public String getPriceUOMCd() {
		return priceUOMCd;
	}

	public void setPriceUOMCd(String priceUOMCd) {
		this.priceUOMCd = priceUOMCd;
	}

	public String getTimezoneCd() {
		return timezoneCd;
	}

	public void setTimezoneCd(String timezoneCd) {
		this.timezoneCd = timezoneCd;
	}

	public String getMktSnapshotCd() {
		return mktSnapshotCd;
	}

	public void setMktSnapshotCd(String mktSnapshotCd) {
		this.mktSnapshotCd = mktSnapshotCd;
	}

	public String getServiceLevelCd() {
		return serviceLevelCd;
	}

	public void setServiceLevelCd(String serviceLevelCd) {
		this.serviceLevelCd = serviceLevelCd;
	}

	public String getRepositoryProductId() {
		return repositoryProductId;
	}

	public void setRepositoryProductId(String repositoryProductId) {
		this.repositoryProductId = repositoryProductId;
	}

	public Date getPricingStartDate() {
		return pricingStartDate;
	}

	public void setPricingStartDate(Date pricingStartDate) {
		this.pricingStartDate = pricingStartDate;
	}

	public Date getPricingEndDate() {
		return pricingEndDate;
	}

	public void setPricingEndDate(Date pricingEndDate) {
		this.pricingEndDate = pricingEndDate;
	}

	public Date getCobDate() {
		return cobDate;
	}

	public void setCobDate(Date cobDate) {
		this.cobDate = cobDate;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	@Override
	public PositionData clone() {
		return this.clone();
	}

}
