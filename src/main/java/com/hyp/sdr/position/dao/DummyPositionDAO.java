package com.hyp.sdr.position.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hyp.sdr.position.PositionData;

public class DummyPositionDAO implements PositionDAO {

	@Override
	public List<PositionData> getPositionData() {

		return null;
	}

	@Override
	public List<PositionData> getConfirmationData() {
		return null;
	}

	private List<PositionData> init() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		PositionData p = new PositionData();

		List<PositionData> positions = new ArrayList<>();

		p.setTradeNum(1001);
		p.setTermNum(1001);
		p.setBuyerQuoteDefNum(1211);
		p.setCobDate(sdf.parse("2016-04-12"));
		p.setDelivSchCd("Monthly");
		p.setExoticTradeInd((byte) 0);
		p.setIceProductCd("ICE_001");
		p.setLastModifyDate(new Date());
		p.setLocationNum(1300);
		p.setMark(12);
		p.setMktSnapshotCd("Official");
		p.setPriceCurrCd("USD");
		p.setPriceUOMCd("BBL");
		p.setPricingEndDate(sdf.parse("2016-05-01"));
		p.setPricingStartDate(sdf.parse("2016-05-30"));
		p.setPutCallInd((byte) -1);
		p.setQtyUOMCd("BBL");
		p.setQuoteTypeInd((byte) 1);
		p.setRefPriceQuoteDefNum(1212);
		p.setRepositoryProductId("REP_Id");
		p.setRiskDelta(0.82);
		p.setRiskMTM(130000);
		p.setRiskQty(100);
		p.setSellerQuoteDefNum(0);
		p.setServiceLevelCd("Firm");
		p.setSpotFX(0.23);
		p.setStrategyNum(201);
		p.setStrikePrice(0);
		p.setTimePeriodCd("May 16");
		p.setTimePeriodTypeInd((byte) 4);
		p.setTimezoneCd("GMT");

		for (int i = 0; i < 50; i++) {
			positions.add(p);
			p = p.clone();
			p.setTermNum(p.getTermNum() + 1);
			p.setTradeNum(p.getTradeNum() + 1);
		}

		return positions;
	}

}
