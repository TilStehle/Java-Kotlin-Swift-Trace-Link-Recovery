package de.unihamburg.swk.parsing.document;

import java.util.List;

/**
 * @author Jakob Andersen
 */

public class LayerCalculator {

	private static final String DEFAULT_LAYER = "default";
	private static LayerManager manager = LayerManager.INSTANCE;
	
	private int guiLayerPosition;
	private String currentLayer;
	
	public LayerCalculator() {
		guiLayerPosition = Integer.MAX_VALUE;
	}
	
	public void currentSize(int size) {
		if (size < guiLayerPosition) {
			guiLayerPosition = Integer.MAX_VALUE;
		}
	}

	public String getCurrentLayer(int currentSize) {
		return guiLayerPosition > currentSize ? DEFAULT_LAYER : currentLayer;
	}

	public void checkEnterlayer(List<String> types, int size) {
		for (String name : types) {
			if (guiLayerPosition == Integer.MAX_VALUE && checkLayers(name)) {
				guiLayerPosition = size;
				break;
			}
		}
	}

	private boolean checkLayers(String name) {
		for (String key : manager.getData().keySet()) {
			if (name.contains(key)) {
				currentLayer = manager.getData().get(key);
				return true;
			}
		}
		return false;
	}
	
}
