package de.unihamburg.masterprojekt2016.traceability;

import java.util.List;

public interface IHasParameter {
	List<Parameter> getParameters();
	void addParameter(Parameter parameter);
}