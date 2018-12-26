package sales.analyzer.api.model.impl;

public class FileEntity {

    private String name;
    private String fullPath;
    private Long lines;
    
    
    public String getFullPath() {
        return fullPath;
    }
    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getLines() {
        return lines;
    }
    public void setLines(Long lines) {
        this.lines = lines;
    }

    
}
