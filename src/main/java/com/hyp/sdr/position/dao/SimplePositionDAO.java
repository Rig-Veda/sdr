package com.hyp.sdr.position.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hyp.sdr.position.PositionData;

/**
 * @author Nalin
 *
 */
public class SimplePositionDAO implements PositionDAO {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * Temp constructor
	 */
	public SimplePositionDAO() {
		logger.debug("Inside SimplePosition constructor");
	}

	@Override
	public List<PositionData> getPositionData() {
		return new ArrayList<>();
	}

	@Override
	public List<PositionData> getConfirmationData() {
		return new ArrayList<>();
	}

}
