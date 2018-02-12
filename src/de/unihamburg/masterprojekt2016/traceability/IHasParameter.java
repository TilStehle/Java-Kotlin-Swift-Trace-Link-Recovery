package de.unihamburg.masterprojekt2016.traceability;

import java.util.List;

public interface IHasParameter {
	List<Parameter> getParameters();
	void addParameter(Parameter parameter);
	default String getOrderedParameterTypes()
	{
		StringBuilder stringBuilder= new StringBuilder();
		for (Parameter parameter : this.getParameters())
		{
			stringBuilder.append(parameter.getType() + ", ");
		}
		if (this.getParameters().size() > 0)
		{
			stringBuilder.setLength(stringBuilder.length() - 2);
		}
		return stringBuilder.toString();
	}

	default String getOrderedParametersAsString()
	{
		StringBuilder stringBuilder= new StringBuilder();
		for (Parameter parameter : this.getParameters())
		{
			stringBuilder.append(parameter.getName()+" "+parameter.getType()  + ", ");
		}
		if (this.getParameters().size() > 0)
		{
			stringBuilder.setLength(stringBuilder.length() - 2);
		}
		return stringBuilder.toString();
	}
}