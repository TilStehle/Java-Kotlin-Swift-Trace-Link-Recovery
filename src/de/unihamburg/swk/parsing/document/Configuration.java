package de.unihamburg.swk.parsing.document;

/**
 * @author Jakob Andersen
 */
public class Configuration {

	private String layerPath;
	private String mappingPath;

	public Configuration(String layerPath, String mappingPath) {
		this.layerPath = layerPath;
		this.mappingPath = mappingPath;
	}

	public String getLayerPath() {
		return layerPath;
	}

	public String getMappingPath() {
		return mappingPath;
	}
	
}
