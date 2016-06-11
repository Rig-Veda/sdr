package com.hyp.sdr.position.dao;

import java.util.List;

import com.hyp.sdr.position.PositionData;

/**
 * @author Nalin
 *
 */
public interface PositionDAO {

	/**
	 * The list of position data according to criteria.
	 * 
	 * @return the list of position data
	 */
	public List<PositionData> getPositionData();

	/**
	 * This method exists to remove the sonar warning about functional
	 * interface.
	 * 
	 * @return
	 */
	public List<PositionData> getConfirmationData();

}
