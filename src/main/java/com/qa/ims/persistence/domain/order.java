package com.qa.ims.persistence.domain;

import java.util.Objects;

public class order {
	private Long orderId;
	private Long fkId;

	public order(Long fkId) {
		this.setFkId(fkId);
	}
	public order(Long orderId, Long fkId) {
		this.setOrderId(orderId);
		this.setFkId(fkId);
		}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getFkId() {
		return fkId;
	}
	public void setFkId(Long fkId) {
		this.fkId = fkId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", fkId=" + fkId + "]";
	}

	@Override
	public int hashCode() {
	return Objects.hash(fkId, orderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		order other = (order) obj;
		return Objects.equals(fkId, other.fkId) && Objects.equals(orderId, other.orderId);
	}


	}

