package de.unihamburg.swk.parsing.antlr4.java8;

public class TestClass {

    private String layerPath;
    private String mappingPath;

    public TestClass(String layerPath, String mappingPath) {
        this.layerPath = layerPath;
        this.mappingPath = mappingPath;
    }

    public String getLayerPath() {
        return layerPath;
    }

    public String getMappingPath() {
        return mappingPath;
    }
    private class innerClass
    {
        private void innermethod()
        {}
    }

}
