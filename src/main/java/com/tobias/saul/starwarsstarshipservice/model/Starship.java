package com.tobias.saul.starwarsstarshipservice.model;

public class Starship {
	
	private String name;
	private String model;
	private String manufacturer;
	private String costInCredits;
	private String lenght;
	private String maxAtmospheringSpeed;
	private String crew;
	private String passengers;
	private String cargoCapacity;
	private String consumables;
	private String hyperdriveRating;
	private String mglt;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCostInCredits() {
		return costInCredits;
	}
	public void setCostInCredits(String costInCredits) {
		this.costInCredits = costInCredits;
	}
	public String getLenght() {
		return lenght;
	}
	public void setLenght(String lenght) {
		this.lenght = lenght;
	}
	public String getMaxAtmospheringSpeed() {
		return maxAtmospheringSpeed;
	}
	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	public String getConsumables() {
		return consumables;
	}
	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}
	public String getHyperdriveRating() {
		return hyperdriveRating;
	}
	public void setHyperdriveRating(String hyperdriveRating) {
		this.hyperdriveRating = hyperdriveRating;
	}
	public String getMglt() {
		return mglt;
	}
	public void setMglt(String mglt) {
		this.mglt = mglt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargoCapacity == null) ? 0 : cargoCapacity.hashCode());
		result = prime * result + ((consumables == null) ? 0 : consumables.hashCode());
		result = prime * result + ((costInCredits == null) ? 0 : costInCredits.hashCode());
		result = prime * result + ((crew == null) ? 0 : crew.hashCode());
		result = prime * result + ((hyperdriveRating == null) ? 0 : hyperdriveRating.hashCode());
		result = prime * result + ((lenght == null) ? 0 : lenght.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((maxAtmospheringSpeed == null) ? 0 : maxAtmospheringSpeed.hashCode());
		result = prime * result + ((mglt == null) ? 0 : mglt.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((passengers == null) ? 0 : passengers.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Starship other = (Starship) obj;
		if (cargoCapacity == null) {
			if (other.cargoCapacity != null)
				return false;
		} else if (!cargoCapacity.equals(other.cargoCapacity))
			return false;
		if (consumables == null) {
			if (other.consumables != null)
				return false;
		} else if (!consumables.equals(other.consumables))
			return false;
		if (costInCredits == null) {
			if (other.costInCredits != null)
				return false;
		} else if (!costInCredits.equals(other.costInCredits))
			return false;
		if (crew == null) {
			if (other.crew != null)
				return false;
		} else if (!crew.equals(other.crew))
			return false;
		if (hyperdriveRating == null) {
			if (other.hyperdriveRating != null)
				return false;
		} else if (!hyperdriveRating.equals(other.hyperdriveRating))
			return false;
		if (lenght == null) {
			if (other.lenght != null)
				return false;
		} else if (!lenght.equals(other.lenght))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (maxAtmospheringSpeed == null) {
			if (other.maxAtmospheringSpeed != null)
				return false;
		} else if (!maxAtmospheringSpeed.equals(other.maxAtmospheringSpeed))
			return false;
		if (mglt == null) {
			if (other.mglt != null)
				return false;
		} else if (!mglt.equals(other.mglt))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passengers == null) {
			if (other.passengers != null)
				return false;
		} else if (!passengers.equals(other.passengers))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Starship [name=" + name + ", model=" + model + ", manufacturer=" + manufacturer + ", costInCredits="
				+ costInCredits + ", lenght=" + lenght + ", maxAtmospheringSpeed=" + maxAtmospheringSpeed + ", crew="
				+ crew + ", passengers=" + passengers + ", cargoCapacity=" + cargoCapacity + ", consumables="
				+ consumables + ", hyperdriveRating=" + hyperdriveRating + ", mglt=" + mglt + "]";
	}
	
	

}
